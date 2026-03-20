package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;
		Persona p1;
		
		p=new Persona();
		p1= new Persona();
		
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());

		System.out.println("-------------------------");
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Edad: "+p1.getEdad());
		System.out.println("estatura: "+p1.getEstatura());
		p.setNombre("MaríaMercedes");
		p.setEdad(55);
		p.setEstatura(2);
	
		System.out.println("-------------------------");
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
	}

}
