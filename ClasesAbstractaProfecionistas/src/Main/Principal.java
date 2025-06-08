package Main;

import java.util.Scanner;

import Clases.LicInformatica;
import Implementacion.LogicaMetodosInformatica;

public class Principal {

	public static void main(String[] args) {
		String titulo;
		long cedula;
		String equipoComputo;
		String tecnologias;
		int menu, indice;
		Scanner leer = null;
		LicInformatica informatico = null;
		LogicaMetodosInformatica imp = new LogicaMetodosInformatica();

		try {
			do {
				System.out.println("Menu principal");
				System.out.println("1--Alta nuevo informatico");
				System.out.println("2--Mostrar informaticos");
				System.out.println("3--Buscar Informatico");
				System.out.println("4--Editar tutulo");
				System.out.println("5--Eliminar informatico");
				System.out.println("6--Salir");
				leer = new Scanner(System.in);
				menu = leer.nextInt();

				switch (menu) {
				case 1:
					try {
						System.out.println("Ingres el nombre de tu titulo:");
						leer = new Scanner(System.in);
						titulo = leer.nextLine();

						System.out.println("Ingresa tu cedula");
						leer = new Scanner(System.in);
						cedula = leer.nextLong();

						System.out.println("Ingrea el marca de tu equipo de computo");
						leer = new Scanner(System.in);
						equipoComputo = leer.nextLine();

						System.out.println("Ingresa la tecnologia que usas");
						leer = new Scanner(System.in);
						tecnologias = leer.nextLine();

						// Creando el nevo objeto
						informatico = new LicInformatica(titulo, cedula, equipoComputo, tecnologias);
						// Agregando a la lista
						imp.guardar(informatico);
						System.out.println("Se guardo");

					} catch (Exception e) {
						System.out.println("Datos  introducidos de maner incorrecta");
					}
					break;
				case 2:
					System.out.println(imp.listar());
					break;
				case 3:
					try {
						System.out.println("Ingresa el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						informatico = imp.buscar(indice);
						System.out.println("Se encontro");
						System.out.println(informatico);
					} catch (Exception e) {
						System.out.println("Indice no encontrado");
					}
					break;
				case 4:
					try {
						System.out.println("Ingresa el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						informatico = imp.buscar(indice);
						System.out.println("Se encontro");
						System.out.println(informatico);
						
						System.out.println("Ingrese el nuevo titulo");
						leer = new Scanner(System.in);
						titulo = leer.nextLine();
						
						informatico.setTitulo(titulo);
						imp.editar(indice, informatico);
						System.out.println("Editado de manera correcta");
						
					} catch (Exception e) {
						System.out.println("Indice no encontrado");
					}
					break;
				case 5:
					try {
						System.out.println("Ingresa el indice a buscar");
						leer = new Scanner(System.in);
						indice = leer.nextInt();
						informatico = imp.buscar(indice);
						System.out.println("Se encontro");
						System.out.println(informatico);
						
						imp.eliminar(indice);
						System.out.println("Registro eliminado");
						
					} catch (Exception e) {
						System.out.println("Indice no encontrado");
					}
					
					break;
				default:
					System.out.println("Selecciona una de las opciones del menu");
					break;
				}

			} while (menu < 6);
		} catch (Exception e) {
			System.out.println("Escoje una de las opciones del munu");
		}

	}

}
