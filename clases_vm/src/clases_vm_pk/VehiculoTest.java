package clases_vm_pk;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v;
		v = new Vehiculo();
		
		System.out.println("=====Vehiculo 1 Creado=====");
		System.out.println("Anio: " + v.anio);
		System.out.println("Marca: " + v.marca);
		System.out.println("Modelo: " + v.modelo);
		
		System.out.println("Vehiculo 1 = Valores asignados");
		v.anio = "2012";
		v.marca = "TOYOTA";
		v.modelo = "YARIS";
		
		System.out.println("Anio: " + v.anio);
		System.out.println("Marca: " + v.marca);
		System.out.println("Modelo: " + v.modelo);	
	
			
		System.out.println("=====Vehiculo 2 Creado=====");
		
		Vehiculo v1;
		v1 = new Vehiculo();
		
		v1.anio = "2026";
		v1.marca = "kia";
		v1.modelo = "cerato";
		
		System.out.println("Anio: " + v1.anio);
		System.out.println("Marca: " + v1.marca);
		System.out.println("Modelo: " + v1.modelo);	
		
	
		System.out.println("=======Vehiculo 3 Creado=======");
		
		Vehiculo v2 = new Vehiculo();
		
		v2.anio = "2027";
		v2.marca = "HYNDAY";
		v2.modelo = "TUCSON";
		
		System.out.println("Anio: " + v2.anio);
		System.out.println("Marca: " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);	
		
	}

}
