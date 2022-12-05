package com.mycompany.DAO;


import com.mycompany.Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class atividadeDAO{
    
     public static void salvar(CadastroLista cadastro) 
        throws SQLException, Exception {
        
        String sql = "INSERT INTO atividade.cad(nome, dat, "
                + "materia, concluido) "
                + "VALUES(?, ?, ?, ?);";
            
            Connection connection = null;
            PreparedStatement preparedStatement = null;
        
            try {
            
            connection = ConnectionUtils.obterConexao();
           
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, cadastro.getNomeAtv());
            preparedStatement.setString(2, cadastro.getDataAtv());
            preparedStatement.setString(3, cadastro.getMateriaAtv());
            preparedStatement.setBoolean(4, cadastro.isStatus());
            
            preparedStatement.execute();
        } finally {
            
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static List<CadastroLista> listar()
        throws SQLException, Exception {
        
        String sql = "SELECT * cad";
        List<CadastroLista> listaCadastro = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try{
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaCadastro == null) {
                    listaCadastro = new ArrayList<CadastroLista>();
                }
                CadastroLista cadastro = new CadastroLista();
                cadastro.setIdAtv(result.getInt("id"));
                cadastro.setNomeAtv(result.getString("nome"));
                cadastro.setMateriaAtv(result.getString("materia"));
                cadastro.setDataAtv(result.getString("dat"));
                cadastro.setStatus(result.getBoolean("concluido"));
             
                listaCadastro.add(cadastro);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaCadastro;
    }

    public static List<CadastroLista> procurar(String nome)
        throws SQLException, Exception {
        
        String sql = "SELECT  id, nome, dat, materia, concluido "
                + "FROM atividade.cad WHERE nome LIKE (?)";
        List<CadastroLista> listaCadastro = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;        
        
        try{
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, "%" + nome + "%");
            
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaCadastro == null) {
                    listaCadastro = new ArrayList<CadastroLista>();
                }
                CadastroLista cadastro = new CadastroLista();
                
                cadastro.setIdAtv(result.getInt("id"));
                cadastro.setNomeAtv(result.getString("nome"));
                cadastro.setDataAtv(result.getString("dat"));
                cadastro.setMateriaAtv(result.getString("materia"));
                cadastro.setStatus(result.getBoolean("concluido"));
                
                listaCadastro.add(cadastro);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaCadastro;
    }
        public static List<CadastroLista> procurarDt(String data)
        throws SQLException, Exception {
        
        String sql = "SELECT  id, nome, dat, materia, concluido "
                + "FROM atividade.cad WHERE dat LIKE (?)";
        List<CadastroLista> listaCadastro = null;
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;        
        
        try{
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, "%" + data + "%");
            
            result = preparedStatement.executeQuery();
            
            while (result.next()) {
                if (listaCadastro == null) {
                    listaCadastro = new ArrayList<CadastroLista>();
                }
                CadastroLista cadastro = new CadastroLista();
                
                cadastro.setIdAtv(result.getInt("id"));
                cadastro.setNomeAtv(result.getString("nome"));
                cadastro.setDataAtv(result.getString("dat"));
                cadastro.setMateriaAtv(result.getString("materia"));
                cadastro.setStatus(result.getBoolean("concluido"));
                
                listaCadastro.add(cadastro);
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaCadastro;
    }

    public static CadastroLista obter(Integer id) 
        throws SQLException, Exception {
        
        String sql = "SELECT * FROM atividade.cad WHERE id =?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();
            
            if(result.next()){
                CadastroLista cadastro = new CadastroLista();
                
                cadastro.setIdAtv(result.getInt("id"));
                cadastro.setNomeAtv(result.getString("nome"));
                cadastro.setDataAtv(result.getString("dat"));
                cadastro.setMateriaAtv(result.getString("materia"));
                cadastro.setStatus(result.getBoolean("concluido"));       
                
                return cadastro;
            }
        }finally{
            if(result != null && !result.isClosed()){
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return null;
    } 
    
    public static void atualizar(CadastroLista cadastroAtualizado) 
        throws SQLException, Exception {
        
        String sql = "UPDATE atividade.cad SET nome = ?, dat = ?, "
                + "materia = ?, concluido = ?"
                + "WHERE id = ?;";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, cadastroAtualizado.getIdAtv());
            preparedStatement.setString(1, cadastroAtualizado.getNomeAtv());
            preparedStatement.setString(2, cadastroAtualizado.getDataAtv());
            preparedStatement.setString(3, cadastroAtualizado.getMateriaAtv());
            preparedStatement.setBoolean(4, cadastroAtualizado.isStatus());            

            //Executa o comando no banco de dados
            preparedStatement.executeUpdate();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static void excluir(Integer id)
        throws SQLException, Exception {
        String sql = "DELETE FROM atividade.cad WHERE id = ?";        
             
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            //Executa o comando no banco de dados
            preparedStatement.executeUpdate();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    public static void excluirMateria(String materia)
        throws SQLException, Exception {
        String sql = "DELETE FROM atividade.cad WHERE materia = ?";        
             
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, materia);
           

            //Executa o comando no banco de dados
            preparedStatement.executeUpdate();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }


    }
}

