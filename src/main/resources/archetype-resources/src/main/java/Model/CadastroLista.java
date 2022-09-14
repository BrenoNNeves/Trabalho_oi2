package Model;

public class CadastroLista {
    
    private String nomeAtv;
    private String dataAtv;
    private String materiaAtv;
    private int idAtv;
    
     public CadastroLista(String nomeAtv, String dataAtv, String materiaAtv, int idAtv) {
        this.nomeAtv = nomeAtv;
        this.dataAtv = dataAtv;
        this.materiaAtv = materiaAtv;
        this.dataAtv = idAtv;
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
