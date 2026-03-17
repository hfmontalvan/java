package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		productoA.nombre="Redoxon";
		productoA.descripcion="Para la gripe";
		productoA.precio=20;
		productoA.stockActual=10; 
		
		System.out.println("nombre: "+productoA.nombre);
		System.out.println("descripcion: "+productoA.descripcion);
		System.out.println("precio: "+productoA.precio);
		System.out.println("stockActual: "+productoA.stockActual);
		
		productoB.nombre="Suero";
		productoB.descripcion="Para la gripe";
		productoB.precio=50;
		productoB.stockActual=20; 
		
		System.out.println("----------------------------------------");
		System.out.println("descripcion: "+productoB.descripcion);
		System.out.println("NOmbre: "+productoB.nombre);
		System.out.println("precio: "+productoB.precio);
		System.out.println("stockActual: "+productoB.stockActual);
		
		productoC.nombre="Ampolla";
		productoC.descripcion="Para la gripe";
		productoC.precio=30;
		productoC.stockActual=30; 
		
		System.out.println("----------------------------------------");
		System.out.println("nombre: "+productoC.nombre);
		System.out.println("descripcion: "+productoC.descripcion);
		System.out.println("precio: "+productoC.precio);
		System.out.println("stockActual: "+productoC.stockActual);
		
		
		
		
		
	}

}
