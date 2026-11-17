package clases_vm_pk;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("======RESTAURANTE 1======");
		Restaurante rest1 = new Restaurante();
		rest1.nombre = "LOLITA";
		rest1.direccion = "LOJA";
		rest1.calificacion = 10;
		System.out.println("Nombre: "+ rest1.nombre);
		System.out.println("Direccion: "+ rest1.direccion);
		System.out.println("Calificacion: "+ rest1.calificacion);
		
		
		System.out.println("======RESTAURANTE 2======");
		Restaurante rest2 = new Restaurante();
		rest2.nombre = "CENTRAL";
		rest2.direccion = "CUENCA";
		rest2.calificacion = 9.8;
		System.out.println("Nombre: "+ rest2.nombre);
		System.out.println("Direccion: "+ rest2.direccion);
		System.out.println("Calificacion: "+ rest2.calificacion);
		
		

	}

}
