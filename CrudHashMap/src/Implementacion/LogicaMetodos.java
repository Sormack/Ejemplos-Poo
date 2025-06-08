package Implementacion;

import java.util.HashMap;

import Clases.Videojuegos;
import Interface.Metodos;

public class LogicaMetodos implements Metodos{
	
	//Los tipo de datos primitivos se pueden parsear
	
	private HashMap<String, Videojuegos> hasMapRegistros = new HashMap<String, Videojuegos>();
	@Override
	public void gurdar(Videojuegos videojuego) {
		hasMapRegistros.put(videojuego.getNombre(), videojuego);
		
	}

	@Override
	public void mostra() {
		System.out.println(hasMapRegistros);
		
	}

	@Override
	public Videojuegos buscar(String nombre) {
		return hasMapRegistros.get(nombre);
	}

	@Override
	public void editar(Videojuegos video) {
		hasMapRegistros.put(video.getNombre(), video);
		
	}

	@Override
	public void eliminar(String nombre) {
		hasMapRegistros.remove(nombre);
		
	}

}
