package br.com.projeto_avaliacao_2.dao;
import java.sql.*;
import br.com.projeto_avaliacao_2.dto.FornecedorDTO;
import java.text.SimpleDateFormat;
/**
 *
 * @author junio
 */


//um fornecedor apenas (um banco), 1xn
public class FornecedorDAO {
    
    public FornecedorDAO(){
    }
    
    SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirFornecedor(FornecedorDTO fornecedorDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into fornecedor (nome_for, cnpj_for, "
                    + "tel_for, sede_for, date_cad_for ) values ( "
                    + "'" + fornecedorDTO.getNome_for()+ "', "
                    + "'" + fornecedorDTO.getCnpj_for()+ "', "
                    + "'" + fornecedorDTO.getTel_for()+ "', "
                    + "'" + fornecedorDTO.getSede_for()+ "', "
                    + "to_date('" + date_format.format(fornecedorDTO.getDate_cad_for())+"','dd/mm/yyyy')) ";
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean alterarFornecedor(FornecedorDTO fornecedorDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Update fornecedor set "
                    + "nome_for = '" + fornecedorDTO.getNome_for()+ "', "
                    + "cnpj_for = '" + fornecedorDTO.getCnpj_for()+ "', "
                    + "tel_for = '" + fornecedorDTO.getTel_for()+ "', "
                    + "sede_for = '" + fornecedorDTO.getSede_for()+ "', "
                    + "date_cad_for = to_date('" + date_format.format(fornecedorDTO.getDate_cad_for())+"','dd/mm/yyyy') "
                    + "where id_for = " + fornecedorDTO.getId_for();
            
            stmt .execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public boolean excluirFornecedor(FornecedorDTO fornecedorDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Delete from fornecedor where id_for = "
                            + fornecedorDTO.getId_for();
            
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "Select f.id_for, f.nome_for " +
                              "from fornecedor f " +
                              "where f.nome_for ilike '" + fornecedorDTO.getNome_for()+ "%' " +
                              "order by f.nome_for";
                break;
                case 2:
                    comando = "Select f.nome_for, f.cnpj_for, f.tel_for, f.sede_for, " +
                              "to_char(f.date_cad_for, 'dd/mm/yyyy') as date_cad_for " +
                              "from fornecedor f " +
                              "where f.id_for = " + fornecedorDTO.getId_for();
            }
            
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    
    
}

    

