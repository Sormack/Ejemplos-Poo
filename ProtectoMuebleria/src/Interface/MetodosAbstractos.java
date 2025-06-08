package Interface;

import java.util.List;

import Clases.Muebles;

public interface MetodosAbstractos {
	public void agregarMueble(Muebles mueble);
	public List<Muebles> mostrarMuebles();
	public Muebles buscarMueble(int indice);
	public void editarMueble(int indice, Muebles mueble);
	public void eliminarMueble(int indice);
	
}
