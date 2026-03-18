package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c;
		double resultadoMulti;
		double resultadoDividir;
		
		c = new Calculadora();
				
		resultadoMulti = c.multiplicar(10, 5);
		resultadoDividir=c.dividir(10, 2);
		
		System.out.println("Resultado Multi: "+resultadoMulti);
		System.out.println("Resultado Dividir: "+resultadoDividir);
		
		
	}

}
