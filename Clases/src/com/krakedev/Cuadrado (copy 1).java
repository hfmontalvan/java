package com.krakedev;

public class Cuadrado {
	
	private int lado;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int calcularArea() {
		int area;
		area=lado*lado;
		return area;
	}
	
	public int calcularPerimetro() {
		int peri;
		peri = lado * 4;
		return peri;
	}
	
}
