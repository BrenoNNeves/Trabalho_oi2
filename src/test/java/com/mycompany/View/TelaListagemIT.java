package com.mycompany.View;

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
public class TelaListagemIT {
    
    public TelaListagemIT() {
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

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TelaListagem.main(args);
        fail("The test case is a prototype.");
    }
    
}
