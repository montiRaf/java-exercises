package it.dib.raf.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListTest {
	private List<Integer> c;
	private List<Integer> t;
	
	@BeforeEach
	public void setUp() {
		c = new LinkedList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		t = new ArrayList<Integer>();
		t.add(1);
		t.add(2);
	}

	@Test
	void testRemoveAll() {
		assertTrue(c.removeAll(t));
		Iterator<Integer> it = c.iterator();
		assertTrue(it.hasNext());
		assertEquals(3, it.next().intValue());
		assertFalse(it.hasNext());
	}
	
	@Test
	void testIndexOf() {
		assertEquals(1, t.indexOf(2));
	}
	
	@Test
	void testContains() {
		assertTrue(c.contains(2));
		assertFalse(c.contains(5));
	}

}
