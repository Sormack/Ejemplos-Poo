package LogicaMetodos;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import Model.Autos;

public class Implementacion implements Metodos{
	private List<Autos> lista = new ArrayList<Autos>();
	
	@Override
	public void guardar(Autos auto) {
		//Manera para que un registro no se repita
		boolean bandera = false;
		for(Autos a:lista) {
			if(a.getMarca().equals(auto.getMarca())) {
				System.out.println("Esa marca ya existe");
				bandera = true;
				break;
			}
		}
		//Si la marca no existe se agrega
		if(bandera == false) {
			lista.add(auto);
			System.out.println("Se guardo");
		}
	}

	@Override
	public List<Autos> mostra() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Autos buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Autos auto) {
		lista.set(indice, auto);
		
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
	}

	@Override
	public Autos buscarMaraca(String marca) {
		for(Autos a:lista) {
			if(a.getMarca().equals(marca)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public List<Autos> buscarTransmicion(String transmicion) {
		List<Autos> listaAutos= new ArrayList<Autos>();
		boolean bandera = false;
		for(Autos a:lista) {
			if(a.getTransmicion().equals(transmicion)) {
				listaAutos.add(a);
				bandera = true;
			
			}
		}
		if(bandera == false) {
			System.out.println("Transmicion no encontrada");
		}
		return listaAutos;
	}

	@Override
	public void editarPrecio(String marca, float precio) {
		for(Autos a:lista) {
			if(a.getMarca().equals(marca)) {
				a.setPrecio(precio);
			}
		}
		
	}

	@Override
	public void eliminarMarca(String marca) {
		
		for(Autos a:lista) {
			if(a.getMarca().equals(marca)) {
				lista.remove(a);
				break;
			}
		}
		
	}

	@Override
	public void editarXmarca(Autos auto) {
		for(int i= 0; i< lista.size();i++) {
			if(lista.get(i).getMarca().equals(auto.getMarca())) {
				lista.set(i, auto);
				System.out.println("Se edito");
				break;
			}
		}
	}

}
