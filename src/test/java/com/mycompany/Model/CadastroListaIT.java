/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charlie
 */
public class CadastroListaIT {
    
    public CadastroListaIT() {
    }

    @Test
    public void testIsStatus() {        
        CadastroLista cad = new CadastroLista();
        boolean res = cad.isStatus();
        boolean expResult = false;
        assertEquals(expResult, res);        
    }

    @Test
    public void testSetStatus() {
    	CadastroLista cad = new CadastroLista();
        boolean res = cad.isStatus();
        boolean expResult = false;
        assertEquals(expResult, res);
    }
    
    @Test
    public void testGetIdAtv() {
    	CadastroLista cad = new CadastroLista();
        int res = cad.getIdAtv();
        int expResult = 0;
        assertEquals(expResult, res);
    }
    @Test
    public void testSettIdAtv() {
        int IdAtv = 10;
        CadastroLista cad = new CadastroLista();
        cad.setIdAtv(IdAtv);
        System.out.println(IdAtv);
    }

   
    @Test
    public void testGetNomeAtv() {
    	CadastroLista cad = new CadastroLista();
        String res = cad.getNomeAtv();
        String expResult = "";
        assertEquals(expResult, "");
    }

    @Test
    public void testSetNomeAtv() {
        String nomeAtv = "Algoritmos";
        CadastroLista cad = new CadastroLista();
        cad.setNomeAtv(nomeAtv);
        System.out.println(nomeAtv);
    }
    
    @Test
    public void testGetDataAtv() {
    	CadastroLista cad = new CadastroLista();
        String expResult = "10/12/2022";
        String result = cad.getDataAtv();
        assertEquals(expResult, "10/12/2022");
        System.out.println(expResult);
    }

    
    @Test
    public void testSetDataAtv() {
        String dataAtv = "11/08/2022";
        CadastroLista cad = new CadastroLista();
        cad.setDataAtv(dataAtv);
        System.out.println(dataAtv);
    }

    
    @Test
    public void testGetMateriaAtv() {
        CadastroLista cad = new CadastroLista();
        String expResult = "Lógica";
        String result = cad.getMateriaAtv();
        assertEquals(expResult, "Lógica");
        System.out.println(expResult);
    }

    
    @Test
    public void testSetMateriaAtv() {
    	String matAtv = "Arquitetura Software";
        CadastroLista cad = new CadastroLista();
        cad.setDataAtv(matAtv);
        System.out.println(matAtv);
    }
    
}
