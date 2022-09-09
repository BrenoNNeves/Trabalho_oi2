package Model;

public class cadastroAtv {
    
    private String nomeAtv;
    private String dataAtv;
    private String materiaAtv;

    public cadastroAtv(String nomeAtv, String dataAtv, String materiaAtv) {
        this.nomeAtv = nomeAtv;
        this.dataAtv = dataAtv;
        this.materiaAtv = materiaAtv;
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
