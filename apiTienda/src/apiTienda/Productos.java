package apiTienda;

public class Productos {
	private long codigoBarras;
	private String nombre;
	private float precio;
	private int existenicia;
	
	public Productos() {
	}
	
	public Productos(long codigoBarras, String nombre, float precio, int existenicia) {
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.precio = precio;
		this.existenicia = existenicia;
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
	public int getExistenicia() {
		return existenicia;
	}
	public void setExistenicia(int existenicia) {
		this.existenicia = existenicia;
	}
	
	@Override
	public String toString() {
		return "Productos [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", precio=" + precio
				+ ", existenicia=" + existenicia + "]";
	}
	
	
}
