package calculadoraPk;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c = new Calculadora();
		double result = c.multiplicar(10, 5);
		System.out.println("La multiplicación es: " + result);
		
		Calculadora c1 = new Calculadora();
		double result1 = c1.dividir(10, 2);
		System.out.println("La división es: " + result1);
		
		Calculadora pr = new Calculadora();
		double prom = pr.promedio(10, 10, 10);
		System.out.println("El promedio es: " + prom);
		
		Calculadora m = new Calculadora();
		m.mensaje();
	}

}
