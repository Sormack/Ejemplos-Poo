package Implementacion;

import java.util.ArrayList;
import java.util.List;
import Clases.Empleados;
import Interfaces.MetodosAbstractos;

public class LogicaDeMetodos implements MetodosAbstractos{
	//Lista que contiene todos los empleados
	List<Empleados> listaEmpleados= new ArrayList<Empleados>();
	

	@Override
	public void guardarEmpleado(Empleados empleado) {
		listaEmpleados.add(empleado);
		
	}
	@Override
	public List<Empleados> mostrarEmpleados() {
		List<Empleados> nuevaLista = new ArrayList<Empleados>();
		nuevaLista = listaEmpleados;
		return nuevaLista;
	}

	@Override
	public Empleados buscarEmpleado(int indice) {
		Empleados empleadoEncontrado = null;
		empleadoEncontrado = listaEmpleados.get(indice);
		return empleadoEncontrado;
	}

	@Override
	public void editarEmpleado(int indice, Empleados empleado) {
		listaEmpleados.set(indice, empleado);
		
	}

	@Override
	public void eliminarEmpleado(int indice) {
		listaEmpleados.remove(indice);
		
	}



}
