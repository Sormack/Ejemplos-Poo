package LogicaMetodos;

import java.util.ArrayList;
import java.util.List;
import Clases.Muebles;
import Interface.MetodosAbstractos;

public class ImplementacionMetodosAbstactos implements MetodosAbstractos{
	private List<Muebles> listaMuebles  = new ArrayList<Muebles>();

	@Override
	public void agregarMueble(Muebles mueble) {
		//Buscar si un mueble se repite
		boolean bandera = false;
		for(Muebles m:listaMuebles) {
			if(m.getNombre().equals(mueble.getNombre())) {
				bandera = true; 
				System.out.println("Ya existe un mueble con ese nombre");
				break;
			}
		}
		if(bandera == false) {
			listaMuebles.add(mueble);
		}
	}

	@Override
	public List<Muebles> mostrarMuebles() {
		return listaMuebles;
	}

	@Override
	public Muebles buscarMueble(int indice) {
		return listaMuebles.get(indice);
	}

	@Override
	public void editarMueble(int indice, Muebles mueble) {
		listaMuebles.set(indice, mueble);
	}

	@Override
	public void eliminarMueble(int indice) {
		listaMuebles.remove(indice);
		
	}

}
