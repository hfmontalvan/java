package com.krakedev;

public class Cuadrado {
	
	public int lado;
	
	public double calcularArea() {
		int area;
		area=lado*lado;
		return area;
	}
	
	public double calcularPerimero() {
		int peri;
		peri = lado * 4;
		return peri;
	}
	
}
