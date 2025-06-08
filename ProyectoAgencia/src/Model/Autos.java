package Model;

public class Autos {
	private String marca;
	private String transmicion;
	private int anioModel;
	private float precio;
	private int stock;
	
	public Autos(String marca, String transmicion, int anioModel, float precio, int stock) {
		this.marca = marca;
		this.transmicion = transmicion;
		this.anioModel = anioModel;
		this.precio = precio;
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTransmicion() {
		return transmicion;
	}

	public void setTransmicion(String transmicion) {
		this.transmicion = transmicion;
	}

	public int getAnioModel() {
		return anioModel;
	}

	public void setAnioModel(int anioModel) {
		this.anioModel = anioModel;
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
		return "Autos [marca=" + marca + ", transmicion=" + transmicion + ", anioModel=" + anioModel + ", precio="
				+ precio + ", stock=" + stock + "]\n";
	}
	
	
}
