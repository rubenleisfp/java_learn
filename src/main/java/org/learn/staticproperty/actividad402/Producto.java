package org.learn.staticproperty.actividad402;

public class Producto {
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;

	}

	public double getPrecio() {
		return precio;
	}
}
