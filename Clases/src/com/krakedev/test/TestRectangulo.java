package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		
		r1.setAltura(10);
		r1.setBase(5);

		r2.setAltura(20);
		r2.setBase(20);
		
		int area = r1.calcularArea();
		int arear2 = r2.calcularArea();
		
		double peri = r1.calcularPerimetro();
		
		r3.setAltura(10);
		r3.setBase(10);
		
		double perimetro = r3.calcularPerimetro();
		
		System.out.println(area);
		System.out.println(arear2);
		System.out.println(perimetro);
		System.out.println(peri);

	}

}
