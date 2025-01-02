package it.dib.rafdev.java.polimorfismo;

public class Orario {
	private int ore;
	private int minuti;
	
	public Orario(int ore, int minuti) {
		this.ore = ore;
		this.minuti = minuti;
	}
	
	public int getOre() {
		return this.ore;
	}
	
	public int getMinuti() {
		return this.minuti;
	}
	
	public boolean minoreDi(Orario o) {
		if(this.getOre() > o.getOre()) {
			return false;
		}
		if(this.getOre() == o.getOre()) {
			return(this.getMinuti() < o.getMinuti());
		}
		return true;
	}
	
	public String toString() {
		return this.getOre() + ":" + this.getMinuti();
	}
}
