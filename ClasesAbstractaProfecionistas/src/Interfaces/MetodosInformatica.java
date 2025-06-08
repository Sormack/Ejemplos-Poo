package Interfaces;

import java.util.List;

import Clases.LicInformatica;

public interface MetodosInformatica {
	public void guardar(LicInformatica inforamtica);
	
	public List<LicInformatica> listar();
	
	public LicInformatica buscar(int indice);
	
	public void editar(int indice, LicInformatica informatica);
	
	public void eliminar(int indice);
}
