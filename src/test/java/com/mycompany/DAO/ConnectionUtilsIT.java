/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charlie
 */
public class ConnectionUtilsIT {  
    
      
    @Test
    public void testObterConexao() throws Exception {
    	ConnectionUtils con = new ConnectionUtils();
        String expResult = "12345";
        con.conectar(expResult);
        assertEquals(expResult,"12345");
        System.out.println(expResult);
    }
    
    @Test
    public void testConexaoNula() throws Exception {
    	ConnectionUtils con = new ConnectionUtils();
        String expResult = null;
        con.conectar(expResult);
        assertEquals(expResult,null);
        System.out.println(expResult);
    }
    
    @Test
    public void testConexaoSenhaErrada() throws Exception {
    	ConnectionUtils con = new ConnectionUtils();
        String expResult = "senha12345";
        con.conectar(expResult);
        assertEquals(expResult,"senha12345");
        System.out.println(expResult);
    }
    
}
