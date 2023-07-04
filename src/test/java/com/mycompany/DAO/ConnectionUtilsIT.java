import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.mycompany.DAO.ConnectionUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtilsTest {

    @Test
    public void testObterConexao() {
        try {
            Connection conn = ConnectionUtils.obterConexao();

            // Verifica se a conexão não é nula
            assertNotNull(conn);

            // Verifica se a conexão está aberta (opcional)
            // assertFalse(conn.isClosed());

            // Feche a conexão após o teste (opcional)
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            // Trate a exceção ou faça uma asserção de falha
        }
    }

    @Test
    public void testObterConexaoExcecao() {
        assertThrows(ClassNotFoundException.class, () -> {
            ConnectionUtils.obterConexao();
        });
    }
}
