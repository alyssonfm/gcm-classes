package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	}

}
