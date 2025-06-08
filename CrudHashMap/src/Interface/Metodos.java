package Interface;

import Clases.Videojuegos;

public interface Metodos {
	public void gurdar(Videojuegos videojuego);
	public void mostra();
	public Videojuegos buscar(String nombre);
	public void editar(Videojuegos video);
	public void eliminar(String nombre);
}
