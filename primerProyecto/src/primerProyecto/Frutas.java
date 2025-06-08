package primerProyecto;

//Las clases son plantillas donde se contiene atributos y metodos de un objeto
public class Frutas {
	//Los atrubutos son las caracteristicas del objeto 
	//Son dinamicos ya que esperan un valor 
	String sabor;
	String color;
	float peso;
	float precio;
	
	//Constructor vacio
	public Frutas() {
	}
	//Contructor sobrecargado con parametros o argumentos 
	public Frutas(String sabor, String color, float peso, float precio) {
		this.sabor = sabor;
		this.color = color;
		this.peso = peso;
		this.precio = precio;
	}
	
	//Convierte un onjeto en una cadena de texto 
	@Override//Polimorfismo
	public String toString() {
		return "Frutas [sabor=" + sabor + ", color=" + color + ", peso=" + peso + ", precio=" + precio + "]";
	}
	
	//Encapsulamiento:Get y Set
	//Metodos : Compuesto por funciones y procediminetos 
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
}
