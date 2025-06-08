package Implementacion;

import java.util.HashMap;

import Clases.Juguetes;
import Metodos.MetodosVacios;

public class LogicaMetodos implements MetodosVacios{
	//"Hash map que contiene una coleccion de juguetes
	HashMap<Long, Juguetes> coleccionJuguetes = new HashMap<Long, Juguetes>();
	
	@Override
	public void guardarJuguete(Juguetes juguete) {
		coleccionJuguetes.put(juguete.getCodigoBarras(), juguete);
		
	}

	@Override
	public void mostraJuguete() {
		System.out.println(coleccionJuguetes);
	}

	@Override
	public Juguetes buscarJuguete(Long codigoBarras) {
		return coleccionJuguetes.get(codigoBarras);
	}

	@Override
	public void editarJuguete(Juguetes juguete) {
		coleccionJuguetes.getOrDefault(juguete.getPrecio(), juguete);
	}

	@Override
	public void eliminarJuguete(Long codigBarras) {
		coleccionJuguetes.remove(codigBarras);
		
	}

}
