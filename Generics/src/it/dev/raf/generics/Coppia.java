package it.dev.raf.generics;

public class Coppia <T> {
	private T primoElemento;
	private T secondoElemento;

	public Coppia(T primo, T secondo) {
		this.primoElemento = primo;
		this.secondoElemento = secondo;
	}
	
	public T getPrimo() {
		return this.primoElemento;
	}
	
	public T getSecondo() {
		return this.secondoElemento;
	}
	
	public void setPrimo(T primo) {
		this.primoElemento = primo;
	}
	
	public void setSecondo(T secondo) {
		this.secondoElemento = secondo;
	}
}
