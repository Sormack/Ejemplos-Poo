package proyectoBiblioteca;

public class Libros {
	String titulo;
	int numeroPag;
	int precion;
	boolean existenicia;
	
	public Libros() {
	}
	public Libros(String titulo, int numeroPag, int precion, boolean existenicia) {
		this.titulo = titulo;
		this.numeroPag = numeroPag;
		this.precion = precion;
		this.existenicia = existenicia;
	}
	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", numeroPag=" + numeroPag + ", precion=" + precion + ", existenicia="
				+ existenicia + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumeroPag() {
		return numeroPag;
	}
	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}
	public int getPrecion() {
		return precion;
	}
	public void setPrecion(int precion) {
		this.precion = precion;
	}
	public boolean isExistenicia() {
		return existenicia;
	}
	public void setExistenicia(boolean existenicia) {
		this.existenicia = existenicia;
	}
	
	
}
