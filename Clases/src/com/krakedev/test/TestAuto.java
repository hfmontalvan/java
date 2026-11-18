package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto("KIA", 2010, 10000);
		auto2 = new Auto();		
	
		/*auto1.setMarca("KIA");
		auto1.setAnio(2001);
		auto1.setPrecio(10000);*/
		
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		
		auto2.setMarca("HYUNDAY");
		auto2.setAnio(2016);
		auto2.setPrecio(16000);
	
		System.out.println("----------------------");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());


	}

}
