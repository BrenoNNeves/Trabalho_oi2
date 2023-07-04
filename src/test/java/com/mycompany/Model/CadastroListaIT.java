import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mycompany.Model.CadastroLista;
import org.junit.jupiter.api.Test;

public class CadastroListaTest {

    @Test
    public void testGetSetNomeAtv() {
        CadastroLista cadastro = new CadastroLista();
        String nomeAtv = "Atividade 1";
        cadastro.setNomeAtv(nomeAtv);
        assertEquals(nomeAtv, cadastro.getNomeAtv());
    }

    @Test
    public void testGetSetDataAtv() {
        CadastroLista cadastro = new CadastroLista();
        String dataAtv = "2023-06-07";
        cadastro.setDataAtv(dataAtv);
        assertEquals(dataAtv, cadastro.getDataAtv());
    }

    @Test
    public void testGetSetMateriaAtv() {
        CadastroLista cadastro = new CadastroLista();
        String materiaAtv = "Matemática";
        cadastro.setMateriaAtv(materiaAtv);
        assertEquals(materiaAtv, cadastro.getMateriaAtv());
    }

    @Test
    public void testGetSetStatus() {
        CadastroLista cadastro = new CadastroLista();
        boolean status = true;
        cadastro.setStatus(status);
        assertEquals(status, cadastro.isStatus());
    }

    @Test
    public void testGetSetIdAtv() {
        CadastroLista cadastro = new CadastroLista();
        int idAtv = 1;
        cadastro.setIdAtv(idAtv);
        assertEquals(idAtv, cadastro.getIdAtv());
    }
}
