package calculadoraPk;

public class Calculadora {
	
	public double multiplicar(double a, double b) {
		double resultado = a * b;
		return resultado;
	}
	public double dividir(double a, double b) {
		double resultado = a / b;
		return resultado;
	}
	public double promedio(double valor1, double valor2, double valor3) {
		double resultado = (valor1 + valor2 +valor3)/3;
		return resultado;
	}
	public void mensaje() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");

	}
	
}
