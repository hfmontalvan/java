package com.krakedev;

public class Calculadora {
	public double multiplicar(double valor1, double valor2) {
		double resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	
	public double dividir (double dividendo, double divisor) {
		double resultadoDividr=dividendo/divisor;
		return resultadoDividr;
	}
	
	public double promediar(double valor1, double valor2, double valor3) {
		double resultadoPromedio=(valor1 + valor2 + valor3)/3;
		return resultadoPromedio;
	}
}
