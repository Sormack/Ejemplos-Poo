package Clases;

public class Juguetes {
	private long codigoBarras;
	private String nombre;
	private float precio;
	private int stock;
	
	public Juguetes(long codigoBarras, String nombre, float precio, int stock) {
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public long getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Jugutes [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", precio=" + precio + ", stock="
				+ stock + "]\n";
	}
	
	
	
}
