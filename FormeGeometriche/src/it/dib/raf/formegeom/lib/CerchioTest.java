package it.dib.raf.formegeom.lib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CerchioTest {
	Punto origine;
	Cerchio c1;

	@BeforeEach
	void setUp() throws Exception {
		origine = new Punto(0,0);
		c1 = new Cerchio(1, origine);
	}

	@Test
	void nonTrasla() {
		c1.trasla(0, 0);
		assertTrue(c1.getCentro().getX() == 0);
		assertTrue(c1.getCentro().getY() == 0);
	}
	
	@Test
	void trasla() {
		c1.trasla(1, 0);
		assertTrue(c1.getCentro().getX() == 1);
		assertTrue(c1.getCentro().getY() == 0);
	}

}
