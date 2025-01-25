package it.dev.raf.generics;

public class Coppias {
	public static <T> void reverse(Coppia <T> c) {
		T tmp;
		tmp = c.getPrimo();
		c.setPrimo(c.getSecondo());
		c.setSecondo(tmp);
	}
	
	public static <T> void fill(Coppia <? super T> c, T elem) {
		c.setPrimo(elem);
		c.setSecondo(elem);
	}
}
