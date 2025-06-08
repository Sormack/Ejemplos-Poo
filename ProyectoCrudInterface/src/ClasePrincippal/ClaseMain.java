package ClasePrincippal;

import Clases.Empleados;
import Implementacion.LogicaDeMetodos;

public class ClaseMain {

	public static void main(String[] args) {
		Empleados empleadoUno = new Empleados(1, "Jose", 456, "Soporte");
		Empleados empleadoDos = new Empleados(2, "Alan", 896, "Desarrollo");
		LogicaDeMetodos impl = new LogicaDeMetodos();
	
		//Guardar empleados
		impl.guardarEmpleado(empleadoUno);
		impl.guardarEmpleado(empleadoDos);
		
		//Mostra Empleados 
		System.out.println(impl.mostrarEmpleados());
		
		//Buscar empleado por indice
		Empleados empleado = null;
		empleado= impl.buscarEmpleado(0);
		System.out.println(empleado);
		
		//Editar empleado
		empleado = impl.buscarEmpleado(0);
		empleado.setDepartamento("Limpieza");
		impl.editarEmpleado(0, empleado);
		System.out.println(impl.mostrarEmpleados());
		
		//Eliminar empleado
		impl.eliminarEmpleado(1);
		System.out.println(impl.mostrarEmpleados());
		
	}

}
