package Clases;

public class Empleados {
	private int numeroEmpleado;
	private String nombre;
	private int sueldo;
	private String departamento;
	
	
	public Empleados() {
	}

	public Empleados(int numeroEmpleado, String nombre, int sueldo, String departamento) {
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.departamento = departamento;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleados [numeroEmpleado=" + numeroEmpleado + ", nombre=" + nombre + ", sueldo=" + sueldo
				+ ", departamento=" + departamento + "]\n";
	}
	
	
}
