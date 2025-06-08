package Main;

import java.util.Scanner;

import Clases.Muebles;
import LogicaMetodos.ImplementacionMetodosAbstactos;

public class Main {

	public static void main(String[] args) {
		String nombre;
		String tipo;
		int precio;
		int existencia,indice,menu;
		Scanner sc = new Scanner(System.in);
		Scanner lectura = null;
		Muebles nuevoMueble = null;
		ImplementacionMetodosAbstactos imp = new ImplementacionMetodosAbstactos();
		
		do {
			System.out.println("1--Agregar un nuevo mueble");
			System.out.println("2--Mostra muebles disponibles");
			System.out.println("3--Buscar mueble mediante indice");
			System.out.println("4--Editar precio del mueble");
			System.out.println("5--Elimar mueble");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				try {
					System.out.println("Ingresa el nombre del mueble");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					
					System.out.println("Ingresa el tipo de mueble");
					lectura = new Scanner(System.in);
					tipo = lectura.nextLine();
					
					System.out.println("Ingresa el precio del mueble");
					precio = sc.nextInt();
					
					System.out.println("Ingres el numero de existencias del mueble");
					existencia = sc.nextInt();
					
					nuevoMueble = new Muebles(nombre, tipo, menu, existencia);
					imp.agregarMueble(nuevoMueble);
				} catch (Exception e) {
					System.out.println("No se pudo guarda el mueble");
				}
				
				break;
			case 2:
					if(imp.mostrarMuebles().size()>0) {
						System.out.println(imp.mostrarMuebles());
						
					}else {
						System.out.println("No hay registros disponibles");
					}
				
				break;
			case 3:
					try {
						System.out.println("Ingrese el indice a bucar");
						indice = sc.nextInt();
						nuevoMueble = imp.buscarMueble(indice);
						System.out.println(nuevoMueble);
					} catch (Exception e) {
						System.out.println("No disponible");
					}
				break;
			case 4:
				try {
					System.out.println("Ingres el indice a editar");
					indice = sc.nextInt();
					System.out.println("Ingresa el nuevo precio");
					precio = sc.nextInt();
					nuevoMueble.setPrecio(precio);
					imp.editarMueble(indice, nuevoMueble);
					System.out.println("Se edito");
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice a eliminar");
					indice = sc.nextInt();
					imp.eliminarMueble(indice);
					System.out.println("mueble eliminado");
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			}
			
		} while (menu < 6);
		
	}

}

























