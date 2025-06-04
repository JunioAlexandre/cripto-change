package br.com.projeto_avaliacao_2.dto;
import java.util.Date;

/**
 *
 * @author junio
 */

public class VendaDTO {
    
    private int id_vend;
    private double val_vend;
    private Date dat_vend;

    public int getId_vend() {
        return id_vend;
    }

    public void setId_vend(int id_vend) {
        this.id_vend = id_vend;
    }

    public double getVal_vend() {
        return val_vend;
    }

    public void setVal_vend(double val_vend) {
        this.val_vend = val_vend;
    }

    public Date getDat_vend() {
        return dat_vend;
    }

    public void setDat_vend(Date dat_vend) {
        this.dat_vend = dat_vend;
    }
    
}
