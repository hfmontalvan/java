package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c;
		double resultadoMulti;
		
		c = new Calculadora();
		resultadoMulti = c.multiplicar(10, 5);
		
		System.out.println("Resultado Multi: "+resultadoMulti);
	}

}
