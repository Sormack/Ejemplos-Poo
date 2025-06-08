package PaqueteCreado;

public class Computadoras {
	private String marca;
	private String modelo;
	private int precio;
	private int stock;
	
	//Todas las clase por default ya tiene el constructor vacio 
	public Computadoras() {
	}
	
	public Computadoras(String marca, String modelo, int precio, int stock) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Computadoras [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", stock=" + stock + "]\n";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
