package Interface;

import java.util.List;

import Model.Autos;

public interface Metodos {
	public void guardar(Autos auto);
	public List<Autos> mostra();
	public Autos buscar(int indice);
	public void editar(int indice,Autos auto);
	public void eliminar(int indice);
	public Autos buscarMaraca(String marca);
	public List<Autos> buscarTransmicion(String transmicion);
	public void editarPrecio(String marca,float precio);
	public void eliminarMarca(String marca);
	
	public void editarXmarca(Autos auto);
}
