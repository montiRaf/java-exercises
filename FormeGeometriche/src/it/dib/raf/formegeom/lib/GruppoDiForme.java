package it.dib.raf.formegeom.lib;

public class GruppoDiForme {
	private IForma[] listaForme = new IForma[10];
	private int numForme = 0;
	
	void trasla(int deltaX, int deltaY) {
		for(int i = 0; i < numForme; i++) {
			listaForme[i].trasla(deltaX, deltaY);
		}
	}
	
	void aggiungiForma(IForma forma) {
		listaForme[numForme] = forma;
		numForme++;
	}
	
	int getNumForme() {
		return this.numForme;
	}
}
