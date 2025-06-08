package Interfaces;

import java.util.List;

import Clases.Empleados;


public interface MetodosAbstractos {
	
	public void guardarEmpleado(Empleados empleado);
	
	public List<Empleados> mostrarEmpleados();
	
	public Empleados buscarEmpleado(int indice);
	
	public void editarEmpleado(int indice,Empleados Empleado);
	 
	 public void eliminarEmpleado(int indice);
}
