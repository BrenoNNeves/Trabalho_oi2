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
        Connection expResult = null;
        Connection res = ConnectionUtils.obterConexao();        
        assertEquals(expResult, res);
        System.out.println(expResult);
    }
    
}
