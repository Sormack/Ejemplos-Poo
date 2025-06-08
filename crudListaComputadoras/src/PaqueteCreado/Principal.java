package PaqueteCreado;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Computadoras computadora = new Computadoras("HP", "Pavilon 360", 18000, 4);
		Computadoras computadora2 = new Computadoras("Asus", "Azus 1", 15000, 4);
		Computadoras computadora3 = new Computadoras("HP", "MX79", 14000, 4);
		
		//CRUD 
		//Una libreria es un conjunto de clases desarrolladas por alguin mas para que 
		//la aplicacion funcione de manera correcta 
		List<Computadoras> listaComputadoras = new ArrayList<Computadoras>();
		
		//1--Agregar elementos a la lista 
		listaComputadoras.add(computadora);
		listaComputadoras.add(computadora2);
		listaComputadoras.add(computadora3);
		
		//2--Mostrar los elementos 
		System.out.println(listaComputadoras);
		
		//3--Buscar por indice
		Computadoras compuEncontrada = null; //inicializada como nula hace que se reserve un espacion en memoria 
		compuEncontrada = listaComputadoras.get(1);
		System.out.println("Se encontro: " + compuEncontrada);
		
		//4 Editar --para editar primero hay que buscar 
		compuEncontrada.setMarca("Lenovo");
		//Para actualizar hay que usar el metodo .set(indice,elemento a actualizar ) 
		listaComputadoras.set(1, compuEncontrada);
		
		//Mostrar los resultados 
		System.out.println(listaComputadoras);
	
		//5 Eliminar 
		listaComputadoras.remove(2);
		
		//Mostrar
		System.out.println(listaComputadoras);
		
		//Realizando un busqueda por marca 
		for(Computadoras c:listaComputadoras) {
			String buscarMarca = "HP";
			if(c.getMarca().equals(buscarMarca)) {
				System.out.println(c);
			}
		}
		
		//Calculo del total del dinero invetido 
		for(Computadoras c:listaComputadoras) {
			int total = 0;
			total += c.getPrecio()*c.getStock();
			System.out.println(total);
		}
		
		float resultado = 0;
		for(int i = 0; i < listaComputadoras.size();i++) {
			resultado += listaComputadoras.get(i).getPrecio() *listaComputadoras.get(i).getStock();
		}
		
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
