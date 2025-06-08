package Main;

import java.text.BreakIterator;
import java.util.Scanner;

import LogicaMetodos.Implementacion;
import Model.Autos;

public class Main {

	public static void main(String[] args) {
		Scanner lectura = null;

		String marca;
		String transmicion;
		int anioModel;
		float precio;
		int stock, menuPrin, indice;

		Autos auto = null;
		Implementacion imp = new Implementacion();

		do {
			System.out.println("Bienvenido");
			System.out.println("1--Dar de alta");
			System.out.println("2--Mostrar");
			System.out.println("3--Buscar");
			System.out.println("4--Editar");
			System.out.println("5--Eliminar");
			System.out.println("6--Buscar marca");
			System.out.println("7--Buscar transmicion");
			System.out.println("8--Editar Precio por marca");
			System.out.println("9--Eliminar por marca");
			System.out.println("10--salir");
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			switch (menuPrin) {
			case 1:
				try {
					// Alta
					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingres el tipo de transmicion");
					lectura = new Scanner(System.in);
					transmicion = lectura.nextLine();

					System.out.println("Ingrese el  anio del auto");
					lectura = new Scanner(System.in);
					anioModel = lectura.nextInt();

					System.out.println("Ingrese el precio del auto");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingrese la cantidad");
					lectura = new Scanner(System.in);
					stock = lectura.nextInt();

					// Creando el objeto
					auto = new Autos(marca, transmicion, anioModel, precio, stock);
					// Guardar
					imp.guardar(auto);

				} catch (Exception e) {
					System.out.println("Error al guardar: " + e.getMessage());
				}

				break;
			case 2:
				if (imp.mostra().size() > 0) {
					System.out.println(imp.mostra());
				} else {
					System.out.println("No hay registros disponibles");
				}
				break;
			case 3:
				try {
					System.out.println("Ingrese el indice a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					auto = imp.buscar(indice);
					System.out.println("Se encontro: " + auto);

				} catch (Exception e) {
					System.out.println("No hay registro");
				}
				break;
			case 4:
				try {
					System.out.println("Ingrese el indice a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					auto = imp.buscar(indice);
					System.out.println("Se encontro: " + auto);

					// Actualizar la transmicion
					System.out.println("Ingrese la nueva transmicion");
					lectura = new Scanner(System.in);
					transmicion = lectura.nextLine();
					// editar
					auto.setTransmicion(transmicion);
					imp.editar(indice, auto);
					System.out.println("Se edito de manera correcta");

				} catch (Exception e) {
					System.out.println("No existe ese registro");
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino");

				} catch (Exception e) {
					System.out.println("No existe este registro");
				}
				break;
			case 6:
				// Buscar por marca
				try {
					System.out.println("Intuce la marca a buscar:");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					System.out.println(imp.buscarMaraca(marca));
				} catch (Exception e) {
					System.out.println("Maraca no  encontrada");
				}
				break;
			case 7:
				// Buscar por transmicion
				try {
					System.out.println("Ingres el tipo de transamicion");
					lectura = new Scanner(System.in);
					
					transmicion = lectura.nextLine();
					System.out.println(imp.buscarTransmicion(transmicion));
					System.out.println("Entrando al caso 7");

				} catch (Exception e) {
					System.out.println("Tipo de transmicion no encontrada");
				}
				break;
			case 8:
				// Editar por marca
				/*try {
					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingrese el nuevo precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					imp.editarPrecio(marca, precio);
					System.out.println("Precio editado");
				} catch (Exception e) {
					System.out.println("Marca no encontrada");
				}*/
				System.out.println("Intuce la marca a buscar:");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				auto = imp.buscarMaraca(marca);
				
				if(auto != null) {
					try {
						System.out.println("Ingres el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						
						//Actualizar registro
						auto.setPrecio(precio);
						imp.editarXmarca(auto);
						
					} catch (Exception e) {
						System.out.println("Error al ingresar el precio");
					}
				}
				break;
			case 9:
				// Eliminar por marca
				try {
					System.out.println("Ingresa la marca a eliminar");

					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					imp.eliminarMarca(marca);
					System.out.println("Marca eliminada");
				} catch (Exception e) {
					System.out.println("Marca no encontrada");
				}
				break;
			case 10:
				break;
			}

		} while (menuPrin < 10);

	}

}
