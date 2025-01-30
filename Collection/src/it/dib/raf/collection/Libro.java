package it.dib.raf.collection;

public class Libro implements Comparable<Libro>{
	private String titolo;
	private int pagine;
	
	public Libro(String titolo, int pagine) {
		this.titolo = titolo;
		this.pagine = pagine;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public int getPagine() {
		return this.pagine;
	}
	
	@Override
	public int compareTo(Libro lib) {
		return this.getTitolo().compareTo(lib.getTitolo());
	}
	
	@Override
	public String toString() {
		return this.titolo + " - " + this.pagine;
	}
}
