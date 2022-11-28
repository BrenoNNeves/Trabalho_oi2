package com.mycompany.Model;

public class CadastroLista {
    
    private String nomeAtv;
    private String dataAtv;
    private String materiaAtv;
    private boolean status;   
    private int idAtv;
    
     /*public CadastroLista(String nomeAtv, String dataAtv, String materiaAtv, int idAtv, boolean status) {
        this.nomeAtv = nomeAtv;
        this.dataAtv = dataAtv;
        this.materiaAtv = materiaAtv;
        this.idAtv = idAtv;
        this.status = status;
    }*/
     
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getIdAtv() {
        return idAtv;
    }

    public void setIdAtv(int idAtv) {
        this.idAtv = idAtv;
    }

    
    public String getNomeAtv() {
        return nomeAtv;
    }

    public void setNomeAtv(String nomeAtv) {
        this.nomeAtv = nomeAtv;
    }

    public String getDataAtv() {
        return dataAtv;
    }

    public void setDataAtv(String dataAtv) {
        this.dataAtv = dataAtv;
    }

    public String getMateriaAtv() {
        return materiaAtv;
    }

    public void setMateriaAtv(String materiaAtv) {
        this.materiaAtv = materiaAtv;
    }

    
}
