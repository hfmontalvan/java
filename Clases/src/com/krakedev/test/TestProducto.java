package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("descripcion: "+productoA.getDescripcion());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("stockActual: "+productoA.getStockActual());
		
		productoB.setNombre("Suero");
		productoB.setDescripcion("Para la gripe");
		productoB.setPrecio(20);
		productoB.setStockActual(30);
		
		System.out.println("----------------------------------------");
		System.out.println("descripcion: "+productoB.getDescripcion());
		System.out.println("NOmbre: "+productoB.getNombre());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("stockActual: "+productoB.getStockActual());
		
		productoC.setNombre("Ampolla");
		productoC.setDescripcion("Para la gripe");
		productoC.setPrecio(20);
		productoC.setStockActual(30);
		
		System.out.println("----------------------------------------");
		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("descripcion: "+productoC.getDescripcion());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("stockActual: "+productoC.getStockActual());
		
	}

}
