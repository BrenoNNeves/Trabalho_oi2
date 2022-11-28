/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Charlie
 * @param <CadastroLista>
 */
public class atividadeDAOIT<CadastroLista> {

    
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
     * Test of salvar method, of class atividadeDAO.
     * @param System 
     */
    @Test
    public void testSalvar(Object System) throws Exception {
     
        CadastroLista cadastro = null;
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class atividadeDAO.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        List<CadastroLista> expResult = null;
        
       // assertEquals(expResult, result);
        fail("Teste listar");
    }

    /**
     * Test of procurar method, of class atividadeDAO.
     */
    @Test
    public void testProcurar() throws Exception {
        System.out.println("procurar");
        String nome = "";
        List<CadastroLista> expResult = null;
        
       //assertEquals(expResult, result);
        fail("Teste procurar.");
    }

    /**
     * Test of obter method, of class atividadeDAO.
     */
    @Test
    public void testObter() throws Exception {
        System.out.println("obter");
        Integer id = null;
        CadastroLista expResult = null;
       
       
        fail("Teste obter");
    }

    /**
     * Test of atualizar method, of class atividadeDAO.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        CadastroLista cadastroAtualizado = null;
       
        fail("Teste atualizar");
    }

    /**
     * Test of excluir method, of class atividadeDAO.
     */
    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Integer id = null;
        atividadeDAO.excluir(id);
        fail("Teste excluir");
    }
    
}
