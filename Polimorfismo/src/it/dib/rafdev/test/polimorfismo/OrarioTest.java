package it.dib.rafdev.test.polimorfismo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.dib.rafdev.java.polimorfismo.Orario;

class OrarioTest {
	
	Orario o1, o2, o3;

	@BeforeEach
	void setUp() throws Exception {
		o1 = new Orario(12, 34);
		o2 = new Orario(21, 40);
		o3 = new Orario(9, 21);
	}

	@Test
	void testMinoreDiTrue() {
		assertTrue(o1.minoreDi(o2));
		assertTrue(o3.minoreDi(o1));
	}
	
	@Test
	void testMinoreDiFalse() {
		assertFalse(o1.minoreDi(o3));
		assertFalse(o2.minoreDi(o3));
	}

}
