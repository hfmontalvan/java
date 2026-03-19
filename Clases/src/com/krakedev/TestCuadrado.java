package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1;
		Cuadrado c2;
		Cuadrado c3;
		
		double areac1, peri1, peri2, peri3;
		double areac2;
		double areac3;
		
		c1 = new Cuadrado();
		c1.lado=5;
		areac1 = c1.calcularArea();
		peri1 = c1.calcularPerimero();
		
		c2 = new Cuadrado();
		c2.lado=10;
		areac2=c2.calcularArea();
		peri2 = c2.calcularPerimero();

		c3 = new Cuadrado();
		c3.lado=15;
		areac3=c3.calcularArea();
		peri3 = c3.calcularPerimero();
				
		System.out.println("Area del Cuadrdo1: "+areac1);
		System.out.println("Area del Cuadrdo2: "+areac2);
		System.out.println("Area del Cuadrdo3: "+areac3);
		
		System.out.println("------------------------------");
		System.out.println("Area del Perimetro1: "+peri1);
		System.out.println("Area del Perimetro2: "+peri2);
		System.out.println("Area del Perimetro3: "+peri3);

	}

}
