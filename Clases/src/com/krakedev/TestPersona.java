package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p;
		Persona p1;
		
		p=new Persona();
		p1= new Persona();
		

		
		System.out.println("Nombre: "+p.nombre);
		System.out.println("Edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);

		System.out.println("-------------------------");
		System.out.println("Nombre: "+p1.nombre);
		System.out.println("Edad: "+p1.edad);
		System.out.println("estatura: "+p1.estatura);
		
		p.nombre="María";
		p.edad=45;
		p.estatura=1.70;
		
		System.out.println("-------------------------");
		System.out.println("Nombre: "+p.nombre);
		System.out.println("Edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);
		
		
	}

}
