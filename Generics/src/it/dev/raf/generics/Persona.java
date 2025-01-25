package it.dev.raf.generics;

public class Persona {
	private String nome;
	private int eta;
	
	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
}
