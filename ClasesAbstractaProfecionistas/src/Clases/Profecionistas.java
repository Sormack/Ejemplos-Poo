package Clases;

//Las clases no se pueden instanciar solo heredar
//Esta es un super clase o clase abstracta
public abstract class Profecionistas {
	//Los atributos son de manera general
	private String titulo;
	private long cadula;
	
	public Profecionistas(String titulo, long cadula) {
		this.titulo = titulo;
		this.cadula = cadula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getCadula() {
		return cadula;
	}

	public void setCadula(long cadula) {
		this.cadula = cadula;
	}
	
	
	
}
