import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TelaCadastroTest {

    @Test
    public void testCadastroLista() {
        CadastroLista cadastro = new CadastroLista();

        // Definir valores nos campos do cadastro
        cadastro.setNomeAtv("Atividade 1");
        cadastro.setDataAtv("2023-06-07");
        cadastro.setMateriaAtv("Matéria 1");
        cadastro.setStatus(true);
        cadastro.setIdAtv(1);

        // Verificar se os valores foram definidos corretamente
        assertEquals("Atividade 1", cadastro.getNomeAtv());
        assertEquals("2023-06-07", cadastro.getDataAtv());
        assertEquals("Matéria 1", cadastro.getMateriaAtv());
        assertEquals(true, cadastro.isStatus());
        assertEquals(1, cadastro.getIdAtv());
    }

    @Test
    public void testButtonSalvarActionPerformed() {
        TelaCadastro telaCadastro = new TelaCadastro();

        // Definir valores nos campos do cadastro
        telaCadastro.getTextFieldDisciplina().setText("Disciplina 1");
        telaCadastro.getTextFieldDate().setText("2023-06-07");
        telaCadastro.getTextFieldAtividade().setText("Atividade 1");

        // Simular a ação do botão "Salvar"
        telaCadastro.getButtonSalvar2().doClick();

        // Verificar se o cadastro foi salvo corretamente
       
        assertNotNull(telaCadastro.getTabelaListagemATVCad().getModel().getValueAt(0, 0));
    }
}
