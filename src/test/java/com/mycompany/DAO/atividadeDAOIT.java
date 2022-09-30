/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import Model.CadastroLista;
import java.util.List;
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
public class atividadeDAOIT {
    
    public atividadeDAOIT() {
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
     * Test of salvar method, of class atividadeDAO.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        CadastroLista cadastro = null;
        atividadeDAO.salvar(cadastro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class atividadeDAO.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        List<CadastroLista> expResult = null;
        List<CadastroLista> result = atividadeDAO.listar();
        assertEquals(expResult, result);
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
        List<CadastroLista> result = atividadeDAO.procurar(nome);
        assertEquals(expResult, result);
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
        CadastroLista result = atividadeDAO.obter(id);
        assertEquals(expResult, result);
        fail("Teste obter");
    }

    /**
     * Test of atualizar method, of class atividadeDAO.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        CadastroLista cadastroAtualizado = null;
        atividadeDAO.atualizar(cadastroAtualizado);
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
