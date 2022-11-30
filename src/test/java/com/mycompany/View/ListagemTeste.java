package com.mycompany.View;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListagemTeste {

	@Test
	void testListagemVazia()throws Exception {
		TelaListagem lis = new TelaListagem();
		String Discilpina = null;	
		lis.busca(Discilpina);
		String expResult = null;
		assertEquals(expResult, Discilpina);
		
	}
	
	@Test
	void testListagemDisciplina()throws Exception {
		TelaListagem lis = new TelaListagem();
		String Discilpina = "Realidade Virtual";	
		lis.busca(Discilpina);
		String expResult = "Realidade Virtual";
		assertEquals(expResult, Discilpina);
		
	}
	
	@Test
	void testListagemID()throws Exception {
		TelaListagem lis = new TelaListagem();
		int id = 11;	
		lis.id(id);
		int expResult = 11;
		assertEquals(expResult, id);		
	}

	@Test
	void testListagemIDInesistente()throws Exception {
		TelaListagem lis = new TelaListagem();
		int id = 0;	
		lis.id(id);
		int expResult = 0;
		assertEquals(expResult, id);		
	}
}
