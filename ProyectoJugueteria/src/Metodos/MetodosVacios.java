package Metodos;

import java.util.List;

import Clases.Juguetes;

public interface MetodosVacios {
	public  void guardarJuguete(Juguetes juguete);
	public void mostraJuguete();
	public Juguetes buscarJuguete(Long codigoBarras);
	public void editarJuguete(Juguetes juguete);
	public void eliminarJuguete(Long codigBarras);
}
