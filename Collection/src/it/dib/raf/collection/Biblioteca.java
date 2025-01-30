package it.dib.raf.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
	private List<Libro> elenco;
	
	public Biblioteca() {
		this.elenco = new ArrayList<>();
	}
	
	public void aggiungiLibro(Libro libro) {
		this.elenco.add(libro);
	}
	
	public List<Libro> elencoOrdinatoPerPagine(){
		ComparatorePerPagine comp = new ComparatorePerPagine();
		Collections.sort(this.elenco, comp);
		return this.elenco;
	}
	
	public static void main(String[] args) {
		Libro l1 = new Libro("Piccolo principe", 102);
		Libro l2 = new Libro("Divina commedia", 342);
		Libro l3 = new Libro("Manuale tv", 45);
		Libro l4 = new Libro("Slam dunk", 200);
		
		Biblioteca b = new Biblioteca();
		b.aggiungiLibro(l1);
		b.aggiungiLibro(l2);
		b.aggiungiLibro(l3);
		b.aggiungiLibro(l4);
		
		List<Libro> libri = b.elencoOrdinatoPerPagine();
		for(Libro lib : libri) {
			System.out.println(lib);
		}
		
	}
}
