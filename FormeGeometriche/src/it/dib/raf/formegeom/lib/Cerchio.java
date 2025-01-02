package it.dib.raf.formegeom.lib;

public class Cerchio implements IForma{
	private int raggio;
	private Punto centro;
	
	public Cerchio(int raggio, Punto centro) {
		this.raggio = raggio;
		this.centro = new Punto(centro.getX(), centro.getY());
	}
	
	@Override
	public void trasla(int deltaX, int deltaY) {
		this.centro.setX(this.centro.getX() + deltaX);
		this.centro.setY(this.centro.getY() + deltaY);
	}
	
	public Punto getCentro() {
		return this.centro;
	}
	
	public int getRaggio() {
		return this.raggio;
	}
	
}
