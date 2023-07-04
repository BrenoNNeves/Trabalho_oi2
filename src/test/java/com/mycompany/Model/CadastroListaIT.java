import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.mycompany.DAO.atividadeDAO;
import com.mycompany.Model.CadastroLista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class atividadeDAOTest {

    @BeforeEach
    public void setUp() {
        // Configuração inicial antes de cada teste
    }

    @AfterEach
    public void tearDown() {
        // Limpeza após cada teste
    }

    @Test
    public void testSalvar() {
        CadastroLista cadastro = new CadastroLista();
        cadastro.setNomeAtv("Nome da Atividade");
        cadastro.setDataAtv("2023-06-07");
        cadastro.setMateriaAtv("Matéria");
        cadastro.setStatus(true);

        try {
            atividadeDAO.salvar(cadastro);

            // Verifica se o cadastro foi salvo corretamente
            assertNotNull(cadastro.getIdAtv());
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testListar() {
        try {
            List<CadastroLista> listaCadastro = atividadeDAO.listar();

            // Verifica se a lista não é nula
            assertNotNull(listaCadastro);

            // Verifica se a lista está vazia (opcional)
            // assertEquals(0, listaCadastro.size());
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testProcurar() {
        String nome = "Nome da Atividade";

        try {
            List<CadastroLista> listaCadastro = atividadeDAO.procurar(nome);

            // Verifica se a lista não é nula
            assertNotNull(listaCadastro);

            // Verifica se a lista está vazia (opcional)
            // assertEquals(0, listaCadastro.size());
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testProcurarDt() {
        String data = "2023-06-07";

        try {
            List<CadastroLista> listaCadastro = atividadeDAO.procurarDt(data);

            // Verifica se a lista não é nula
            assertNotNull(listaCadastro);

            // Verifica se a lista está vazia (opcional)
            // assertEquals(0, listaCadastro.size());
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testObter() {
        Integer id = 1;

        try {
            CadastroLista cadastro = atividadeDAO.obter(id);

            // Verifica se o objeto não é nulo
            assertNotNull(cadastro);

            // Verifica se o id do cadastro é o esperado
            assertEquals(id, cadastro.getIdAtv());
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testAtualizar() {
        CadastroLista cadastroAtualizado = new CadastroLista();
        cadastroAtualizado.setIdAtv(1);
        cadastroAtualizado.setNomeAtv("Nome Atualizado");
        cadastroAtualizado.setDataAtv("2023-06-08");
        cadastroAtualizado.setMateriaAtv("Matéria Atualizada");
        cadastroAtualizado.setStatus(false);

        try {
            atividadeDAO.atualizar(cadastroAtualizado);

            // Verifique se o cadastro foi atualizado corretamente
            CadastroLista cadastroObtido = atividadeDAO.obter(cadastroAtualizado.getIdAtv());
            assertNotNull(cadastroObtido);
            assertEquals(cadastroAtualizado.getNomeAtv(), cadastroObtido.getNomeAtv());
            assertEquals(cadastroAtualizado.getDataAtv(), cadastroObtido.getDataAtv());
            assertEquals(cadastroAtualizado.getMateriaAtv(), cadastroObtido.getMateriaAtv());
            assertEquals(cadastroAtualizado.isStatus(), cadastroObtido.isStatus());
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testExcluir() {
        Integer id = 1;

        try {
            atividadeDAO.excluir(id);

            // Verifique se o cadastro foi excluído corretamente
            CadastroLista cadastroExcluido = atividadeDAO.obter(id);
            assertNull(cadastroExcluido);
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testExcluirMateria() {
        String materia = "Matéria";

        try {
            atividadeDAO.excluirMateria(materia);

            // Verifique se os cadastros com a matéria foram excluídos corretamente
            List<CadastroLista> listaCadastro = atividadeDAO.procurar(materia);
            assertNull(listaCadastro);
        } catch (SQLException | Exception e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }
}
