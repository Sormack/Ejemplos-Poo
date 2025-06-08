package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Clases.LicInformatica;
import Interfaces.MetodosInformatica;

public class LogicaMetodosInformatica implements MetodosInformatica{
	private List<LicInformatica> lista = new ArrayList<LicInformatica>();
	
	@Override
	public void guardar(LicInformatica inforamtica) {
		lista.add(inforamtica);
		
	}

	@Override
	public List<LicInformatica> listar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public LicInformatica buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, LicInformatica informatica) {
		lista.set(indice, informatica);
		
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
		
	}

}
