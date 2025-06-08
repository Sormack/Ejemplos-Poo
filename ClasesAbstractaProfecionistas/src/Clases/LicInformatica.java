package Clases;

public class LicInformatica extends Profecionistas{
	private String equipoComputo;
	private String tecnologias;
	
	public LicInformatica(String titulo, long cadula, String equipoComputo, String tecnologias) {
		super(titulo, cadula);
		this.equipoComputo = equipoComputo;
		this.tecnologias = tecnologias;
	}
		
	public String getEquipoComputo() {
		return equipoComputo;
	}

	public void setEquipoComputo(String equipoComputo) {
		this.equipoComputo = equipoComputo;
	}

	public String getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(String tecnologias) {
		this.tecnologias = tecnologias;
	}

	@Override
	public String toString() {
		return "LicInformatica [getTitulo()=" + getTitulo() + ", getCadula()=" + getCadula() + ", equipoComputo="
				+ equipoComputo + ", tecnologias=" + tecnologias + "]\n";
	}
	
	
}
