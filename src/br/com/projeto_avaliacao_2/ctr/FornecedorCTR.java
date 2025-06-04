package br.com.projeto_avaliacao_2.ctr;
import java.sql.ResultSet;
import br.com.projeto_avaliacao_2.dto.FornecedorDTO;
import br.com.projeto_avaliacao_2.dao.FornecedorDAO;
import br.com.projeto_avaliacao_2.dao.ConexaoDAO;
/**
 *
 * @author junio
 */

public class FornecedorCTR {
    
    FornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    public FornecedorCTR(){
    }
    
    public String inserirFornecedor(FornecedorDTO fornecedorDTO){
        try{
            if (fornecedorDAO.inserirFornecedor(fornecedorDTO)){
                return "Fornecedor cadastrado com Sucesso!!!";
            } else{
                return "Fornecedor NÃO Cadastrado!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor NÃOÃ Cadastrado";
        }
    }
    
    public String alterarFornecedor(FornecedorDTO fornecedorDTO){
        try{
            if (fornecedorDAO.alterarFornecedor(fornecedorDTO)){
                return "Fornecedor alterado com Sucesso!!!";
            } else{
                return "Fornecedor NÃO alterado!!!";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor NÃO alterado!!!";
        }
    }
    
    public String excluirFornecedor(FornecedorDTO fornecedorDTO){
        try{
            if (fornecedorDAO.excluirFornecedor(fornecedorDTO)){
                return "Fornecedor Excluido com sucesso!!!";
            } else{
                return "Fornecedor NÃO excluido!!!";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor NÃO excluido!!!";
        }
    }
    
    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao){
        ResultSet rs = null;
        rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
    
    
}
