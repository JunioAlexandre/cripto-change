package br.com.projeto_avaliacao_2.dto;
import java.util.Date;
/**
 *
 * @author junio
 */


public class FornecedorDTO {
    private String nome_for, cnpj_for, tel_for, sede_for;
    private Date date_cad_for;
    private int id_for;

    public String getNome_for() {
        return nome_for;
    }

    public void setNome_for(String nome_for) {
        this.nome_for = nome_for;
    }

    public String getCnpj_for() {
        return cnpj_for;
    }

    public void setCnpj_for(String cnpj_for) {
        this.cnpj_for = cnpj_for;
    }

    public String getTel_for() {
        return tel_for;
    }

    public void setTel_for(String tel_for) {
        this.tel_for = tel_for;
    }

    public String getSede_for() {
        return sede_for;
    }

    public void setSede_for(String sede_for) {
        this.sede_for = sede_for;
    }

    public Date getDate_cad_for() {
        return date_cad_for;
    }

    public void setDate_cad_for(Date date_cad_for) {
        this.date_cad_for = date_cad_for;
    }

    public int getId_for() {
        return id_for;
    }

    public void setId_for(int id_for) {
        this.id_for = id_for;
    }
}
