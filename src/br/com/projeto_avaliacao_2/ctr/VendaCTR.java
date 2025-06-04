package br.com.projeto_avaliacao_2.ctr;
import br.com.projeto_avaliacao_2.dao.ConexaoDAO;
import br.com.projeto_avaliacao_2.dao.VendaDAO;
import br.com.projeto_avaliacao_2.dto.VendaDTO;
import br.com.projeto_avaliacao_2.dto.ClienteDTO;
import javax.swing.JTable;

/**
 *
 * @author junio
 */

public class VendaCTR {
    VendaDAO vendaDAO = new VendaDAO();
    
    public VendaCTR(){
        
    }
    
    public String inserirVenda(VendaDTO vendaDTO, ClienteDTO clienteDTO, JTable produtos){
        try{
            if(vendaDAO.inserirVenda(vendaDTO, clienteDTO, produtos)){
                return "Venda Cadastrada com sucesso!!!";
            }else {
                return "Venda NÃO Cadastrada!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Venda NÃO Cadastrada";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}
