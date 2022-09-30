/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import Model.CadastroLista;
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
public class CadastroListaIT {
    
    public CadastroListaIT() {
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
     * Test of isStatus method, of class CadastroLista.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        CadastroLista instance = new CadastroLista();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        fail("Teste status.");
    }

    /**
     * Test of setStatus method, of class CadastroLista.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        CadastroLista instance = new CadastroLista();
        instance.setStatus(status);
        fail("Teste status.");
    }

    /**
     * Test of getIdAtv method, of class CadastroLista.
     */
    @Test
    public void testGetIdAtv() {
        System.out.println("getIdAtv");
        CadastroLista instance = new CadastroLista();
        int expResult = 0;
        int result = instance.getIdAtv();
        assertEquals(expResult, result);
        fail("Teste atividade");
    }

    /**
     * Test of setIdAtv method, of class CadastroLista.
     */
    @Test
    public void testSetIdAtv() {
        System.out.println("setIdAtv");
        int idAtv = 0;
        CadastroLista instance = new CadastroLista();
        instance.setIdAtv(idAtv);
        fail("Teste atividade");
    }

    /**
     * Test of getNomeAtv method, of class CadastroLista.
     */
    @Test
    public void testGetNomeAtv() {
        System.out.println("getNomeAtv");
        CadastroLista instance = new CadastroLista();
        String expResult = "";
        String result = instance.getNomeAtv();
        assertEquals(expResult, result);
        fail("Teste nome");
    }

    /**
     * Test of setNomeAtv method, of class CadastroLista.
     */
    @Test
    public void testSetNomeAtv() {
        System.out.println("setNomeAtv");
        String nomeAtv = "";
        CadastroLista instance = new CadastroLista();
        instance.setNomeAtv(nomeAtv);
        fail("Teste nome");
    }

    /**
     * Test of getDataAtv method, of class CadastroLista.
     */
    @Test
    public void testGetDataAtv() {
        System.out.println("getDataAtv");
        CadastroLista instance = new CadastroLista();
        String expResult = "";
        String result = instance.getDataAtv();
        assertEquals(expResult, result);
        fail("Teste data");
    }

    /**
     * Test of setDataAtv method, of class CadastroLista.
     */
    @Test
    public void testSetDataAtv() {
        System.out.println("setDataAtv");
        String dataAtv = "";
        CadastroLista instance = new CadastroLista();
        instance.setDataAtv(dataAtv);
        fail("Teste data");
    }

    /**
     * Test of getMateriaAtv method, of class CadastroLista.
     */
    @Test
    public void testGetMateriaAtv() {
        System.out.println("getMateriaAtv");
        CadastroLista instance = new CadastroLista();
        String expResult = "";
        String result = instance.getMateriaAtv();
        assertEquals(expResult, result);
        fail("Teste materia");
    }

    /**
     * Test of setMateriaAtv method, of class CadastroLista.
     */
    @Test
    public void testSetMateriaAtv() {
        System.out.println("setMateriaAtv");
        String materiaAtv = "";
        CadastroLista instance = new CadastroLista();
        instance.setMateriaAtv(materiaAtv);
        fail("Teste materia");
    }
    
}
