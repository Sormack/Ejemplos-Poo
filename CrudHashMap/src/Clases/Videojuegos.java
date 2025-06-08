package Clases;

import java.time.LocalDate;

public class Videojuegos {
	private String nombre;
	private String genero;
	private float precio;
	private LocalDate fechaLanzamiento;
	
	public Videojuegos(String nombre, String genero, float precio, LocalDate fechaLanzamiento) {
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	@Override
	public String toString() {
		return "Videojuegos [nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + ", fechaLanzamiento="
				+ fechaLanzamiento + "]\n";
	} 

	
}
