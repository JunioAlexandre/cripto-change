package br.com.projeto_avaliacao_2.ctr;
import java.sql.ResultSet;
import br.com.projeto_avaliacao_2.dto.FuncionarioDTO;
import br.com.projeto_avaliacao_2.dao.FuncionarioDAO;
import br.com.projeto_avaliacao_2.dao.ConexaoDAO;

/**
 *
 * @author junio
 */

public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public FuncionarioCTR(){
        
    }
    
    public String inserirFuncionario(FuncionarioDTO funcionarioDTO){
        try{
            if(funcionarioDAO.inserirFuncionario(funcionarioDTO)){
                return "Funcionario cadastrado com sucesso!!!";
            } else {
                return "Funcionario não cadastradoã!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Funcionario não cadastrado";
        }
    }
    
    public String alterarFuncionario(FuncionarioDTO funcionarioDTO){
        try{
            if(funcionarioDAO.alterarFuncionario(funcionarioDTO)){
                return "Funcionario alterado com sucesso!!!";
            } else {
                return "Funcionario não alterado";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Funcionario não alterado!!!";
        }
    }
    
    public String excluirFuncionario(FuncionarioDTO funcionarioDTO){
        try{
            if(funcionarioDAO.excluirFuncionario(funcionarioDTO)){
                return "Funcionario excluido com sucesso!!!";
            } else{
                return "Funcionario não excluido!!!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Funcionario não excluido!!!";
        }
    }
    
    public ResultSet consultarFuncionario(FuncionarioDTO funcionarioDTO, int opcao){
        ResultSet rs = null;
        rs = funcionarioDAO.consultarFuncionario(funcionarioDTO, opcao);
        return rs;
    }
    
    public String logarFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.logarFuncionario(funcionarioDTO);
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}
