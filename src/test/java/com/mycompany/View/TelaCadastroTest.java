package com.mycompany.View;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelaCadastroTest {

	@Test
	public void testInicialCadastro() {
		TelaCadastro lis = new TelaCadastro();
		lis.cad(null);
		String expResult = "Programação Web 2";
		String Discilpina = "Programação Web 2";
		assertEquals(expResult, Discilpina);
	}
	
	@Test
	public void testInicialBusca() {
		TelaCadastro lis = new TelaCadastro();
		String disciplina = "Desenvolvimento De Jogos";
		lis.cad(disciplina);
		String expResult = "Desenvolvimento De Jogos";
		assertEquals(expResult, disciplina);
	}
	
	@Test
	public void testInicialBuscaNulo() {
		TelaCadastro lis = new TelaCadastro();
		String disciplina = null;
		lis.cad(disciplina);
		String expResult = null;
		assertEquals(expResult, disciplina);
	}

}
