package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		
		r1.altura=10;
		r1.base=5;
		
		r2.altura=20;
		r2.base=5;
		
		int area = r1.calcularArea();
		int arear2 = r2.calcularArea();
		
		double peri = r1.calcularPerimetro();
		
		r3.altura=10;
		r3.base=10;
		
		double perimetro = r3.calcularPerimetro();
		
		System.out.println(area);
		System.out.println(arear2);
		System.out.println(perimetro);
		System.out.println(peri);

	}

}
