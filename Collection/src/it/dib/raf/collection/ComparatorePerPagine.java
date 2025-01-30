package it.dib.raf.collection;

import java.util.Comparator;

public class ComparatorePerPagine implements Comparator<Libro> {
	
	@Override
	public int compare(Libro libro1, Libro libro2) {
		if(libro1.getPagine() == libro2.getPagine()) {
			return 0;
		}else if(libro1.getPagine() < libro2.getPagine()) {
			return -1;
		}else {
			return 1;
		}
	}
}
