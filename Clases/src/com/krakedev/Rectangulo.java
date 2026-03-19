package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularArea() {
		int resultadoMulti=base*altura;
		return resultadoMulti;
	}

		
	public double calcularPerimetro() {
		int resultadoPeri=(base + altura)*2;
		return resultadoPeri;
	}
	
}