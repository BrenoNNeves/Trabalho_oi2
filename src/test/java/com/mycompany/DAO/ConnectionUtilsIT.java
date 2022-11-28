/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charlie
 */
public class ConnectionUtilsIT {
    
    public ConnectionUtilsIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obterConexao method, of class ConnectionUtils.
     */
    @Test
    public void testObterConexao() throws Exception {
        System.out.println("obterConexao");
        Connection expResult = null;
        Connection result = ConnectionUtils.obterConexao();
        assertEquals(expResult, result);
        equals("Teste conection");
    }
    
}
