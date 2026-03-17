package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto();
		auto2 = new Auto();
		
	
		auto1.marca="KIA";
		auto1.anio=2010;
		auto1.precio=10000;
		
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Año: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		
		auto2.marca="HYUNDAI";
		auto2.anio=2016;
		auto2.precio=16000;
	
		System.out.println("----------------------");
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Año: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);
		
		

	}

}
