package it.dib.raf.formegeom.lib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GruppoDiFormeTest {
	
	GruppoDiForme g = new GruppoDiForme();
	Cerchio c1, c2;	
	Rettangolo r1, r2;
	Punto origine;
	Punto p1;
	Punto p2;

	@BeforeEach
	void setUp() throws Exception {
		origine = new Punto(0, 0);
		p1 = new Punto(1, 2);
		p2 = new Punto(2, -1);
		c1 = new Cerchio(1, p1);
		c2 = new Cerchio(2, origine);
		r1 = new Rettangolo(p2, 3, 4);
		r2 = new Rettangolo(origine, 2, 2);
	}

	@Test
	void gruppoVuoto() {
		assertEquals(g.getNumForme(), 0);
	}
	
	@Test
	void gruppoSemplice() {
		g.aggiungiForma(c1);
		assertEquals(g.getNumForme(), 1);
		g.trasla(2, 1);
		assertEquals(c1.getCentro(), new Punto(3, 3));
		// assertEquals(c1.getCentro().getY(), 3);
	}
	
	@Test
	void gruppoComposito() {
		g.aggiungiForma(c1);
		g.aggiungiForma(r2);
		assertEquals(g.getNumForme(), 2);
		g.trasla(1, -1);
		assertEquals(c1.getCentro(), new Punto(2, 1));
		assertEquals(c1.getCentro().getY(), 1);
		assertEquals(r2.getVertice(), new Punto(1, -1));
	}
	

}
