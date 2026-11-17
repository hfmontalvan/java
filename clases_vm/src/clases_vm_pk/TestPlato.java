package clases_vm_pk;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======OBJETO PLATO 1======");
		Plato platoA = new Plato();
		platoA.nombre = "CECINA";
		platoA.tipo = "A LA CARTA";
		platoA.precio = 12.50;
		platoA.disponible = true;
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);
		
		System.out.println("======OBJETO PLATO 2======");
		Plato platoB = new Plato();
		platoB.nombre = "FRITADA";
		platoB.tipo = "A LA CARTA";
		platoB.precio = 15;
		platoB.disponible = true;
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);
		
		System.out.println("======OBJETO PLATO 3======");
		Plato platoC = new Plato();
		platoC.nombre = "FRITADA";
		platoC.tipo = "A LA CARTA";
		platoC.precio = 15;
		platoC.disponible = false;
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);
		
	}

}
