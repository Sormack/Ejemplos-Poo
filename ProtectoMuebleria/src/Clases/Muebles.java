package Clases;

public class Muebles {
	private String nombre;
	private String tipo;
	private int precio;
	private int existencia;
	
	public Muebles(String nombre, String tipo, int precio, int existencia) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.existencia = existencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Muebles [nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", existencia=" + existencia
				+ "\n";
	}
	
	

}
