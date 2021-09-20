package tests;

import org.junit.*;
import static org.junit.Assert.*;

import code.ListaCheiaException;
import code.ListaEstatica;

public class TestListaEstatica {

	@Test
	void testConstructor() {
		ListaEstatica<String> l = new ListaEstatica<String>(10);
		assertTrue(l.getQuantidade() == 0);
		assertTrue(l.isVazia());
		assertFalse(l.isCheia());
	}
	
	@Test
	void testGetQuantidade() {
		ListaEstatica<String> l = new ListaEstatica<String>(10);
		assertTrue(l.getQuantidade() == 0);
		try {
			l.inserirInicio("Alysson");
		} catch (ListaCheiaException e) {
			e.printStackTrace();
		}
		assertEquals(l.getQuantidade(), 1);
	}
	
	@Test
	void testIsVazia() {
		ListaEstatica<String> l = new ListaEstatica<String>(10);
		assertTrue(l.isVazia());
		try {
		l.inserirFim("Alysson");
		assertFalse(l.isVazia());
		
	    } catch (ListaCheiaException e) {
		e.printStackTrace();
	    }
	}
	
	@Test
	void testInserirFim() {
	    ListaEstatica<String> l = new ListaEstatica<String>(10);
	    try {
		l.inserirFim("Alysson");
		assertTrue(l.pesquisar("Alysson") != -1);
		
	    } catch (ListaCheiaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}

}
