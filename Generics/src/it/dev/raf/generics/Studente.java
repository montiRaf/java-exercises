package it.dev.raf.generics;

public class Studente extends Persona {
	private String matricola;
	private int numEsami = 0;
	
	public Studente(String nome, int eta, String matricola) {
		super(nome, eta);
		this.matricola = matricola;
	}
	
	public void addEsame() {
		this.numEsami++;
	}
	
	public static void main(String [] args) {
		Coppia<Persona> coppia;
		Studente s1 = new Studente("Paolo", 30, "12345");
		Studente s2 = new Studente("Guido", 22, "19123");
		Persona p1 = new Persona("Laura", 31);
		coppia = new Coppia<Persona>(s1, p1);
		
		System.out.println(coppia.getPrimo().getNome());
		System.out.println(coppia.getSecondo().getNome());
	}
}
