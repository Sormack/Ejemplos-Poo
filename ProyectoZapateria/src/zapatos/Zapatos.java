package zapatos;

public class Zapatos {
	private String clave;
	private String color;
	private float precio;
	private int existencia;
	
	public Zapatos() {
	}

	public Zapatos(String clave, String color, float precio, int existencia) {
		this.clave = clave;
		this.color = color;
		this.precio = precio;
		this.existencia = existencia;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
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
		return "Zapatos [clave=" + clave + ", color=" + color + ", precio=" + precio + ", existencia=" + existencia
				+ "]\n";
	}
	
	
}
