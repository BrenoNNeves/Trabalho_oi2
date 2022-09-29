package com.mycompany.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtils {
    
    /**
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection obterConexao() throws ClassNotFoundException, 
            SQLException 
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection
            ("jdbc:mysql://localhost:8306/atividade?useTimezone=true&serverTimezone=UTC","root", "1234");
        return conn;
    }
    
}
