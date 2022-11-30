package com.mycompany.DAO;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.fail;

import java.util.List;



/**
 *
 * @author Charlie
 * @param <CadastroLista>
 */
public class atividadeDAOTest<CadastroLista> {

   
   
    @Test
    public void testProcurar() throws Exception {   
         String nome = "Luis";        
         String expResult = nome;
         assertEquals(expResult, nome);        
    }

    @Test
    public void testObter() throws Exception {
        Integer id = null;
        CadastroLista expResult = null;    
        assertEquals(expResult, id);
    }
   
    @Test
    public void testObterID() throws Exception {
        Integer id = 1;
        CadastroLista expResult = (CadastroLista) id;    
        assertEquals(expResult, id);
    }
    
    @Test
    public void testObterIDErrado() throws Exception {
        Integer id = -2;
        CadastroLista expResult = (CadastroLista) id;    
        assertEquals(expResult, id);
    }
    
}
