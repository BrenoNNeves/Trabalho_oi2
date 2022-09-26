package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtils {
    
    public static Connection obterConexao() throws ClassNotFoundException, 
            SQLException 
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/atividade?useTimezone=true&serverTimezone=UTC","root", "5640");
        return conn;
    }
    
}
