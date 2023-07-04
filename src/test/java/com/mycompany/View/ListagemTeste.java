import org.junit.Assert;
import org.junit.Test;

public class TestesSistema {

    @Test
    public void testeBuscaPorNome() {
        // Insira o nome "Maria" no campo de busca
        String nomeBusca = "Maria";
        campoBusca.setText(nomeBusca);

        // Clique no botão "BUSCAR"
        botaoBuscar.click();

        // Verifique se a tabela exibe corretamente as atividades relacionadas à busca pelo nome "Maria"
        List<Atividade> atividadesEncontradas = tabelaAtividades.getAtividades();
        for (Atividade atividade : atividadesEncontradas) {
            Assert.assertEquals(nomeBusca, atividade.getNome());
        }
    }

    @Test
    public void testeBuscaPorData() {
        // Insira a data "01/06/2023" no campo de busca por data
        String dataBusca = "01/06/2023";
        campoData.setText(dataBusca);

        // Clique no botão "BUSCAR"
        botaoBuscar.click();

        // Verifique se a tabela exibe corretamente as atividades relacionadas à busca pela data "01/06/2023"
        List<Atividade> atividadesEncontradas = tabelaAtividades.getAtividades();
        for (Atividade atividade : atividadesEncontradas) {
            Assert.assertEquals(dataBusca, atividade.getData());
        }
    }

    @Test
    public void testeEdicaoDeNome() {
        // Selecione uma atividade na tabela
        Atividade atividadeSelecionada = tabelaAtividades.getAtividadeSelecionada();

        // Clique no botão "EDITAR"
        botaoEditar.click();

        // Edite o nome da atividade para "Nova Atividade"
        String novoNome = "Nova Atividade";
        campoNome.setText(novoNome);

        // Salve as alterações
        botaoSalvar.click();

        // Verifique se o nome da atividade selecionada foi alterado para "Nova Atividade"
        Assert.assertEquals(novoNome, atividadeSelecionada.getNome());
    }

    @Test
    public void testeExclusaoAtividade() {
        // Selecione uma atividade na tabela
        Atividade atividadeSelecionada = tabelaAtividades.getAtividadeSelecionada();

        // Clique no botão "DELETAR"
        botaoDeletar.click();

        // Verifique se a atividade selecionada foi corretamente excluída do banco de dados e removida da tabela
        List<Atividade> atividades = tabelaAtividades.getAtividades();
        Assert.assertFalse(atividades.contains(atividadeSelecionada));
    }

    @Test
    public void testeExclusaoMateria() {
        // Insira o nome de uma matéria existente, como "Matemática", no campo "DELETAR MATERIA"
        String materiaDeletar = "Matemática";
        campoDeletarMateria.setText(materiaDeletar);

        // Clique no botão "DELETAR MATERIA"
        botaoDeletarMateria.click();

        // Verifique se todas as atividades relacionadas à matéria "Matemática" foram corretamente excluídas do banco de dados
        List<Atividade> atividades = tabelaAtividades.getAtividades();
        for (Atividade atividade : atividades) {
            Assert.assertNotEquals(materiaDeletar, atividade.getMateria());
        }
    }
}
