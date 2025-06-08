package Main;

import java.util.Scanner;

import Clases.Juguetes;
import Implementacion.LogicaMetodos;

public class Main {

	public static void main(String[] args) {
		long codigoBarras;
		String nombre;
		float precio;
		int stock,menu;
		
		Scanner leer = null;
		Juguetes juguete = null;
		LogicaMetodos imp = new LogicaMetodos();
		
		try {
			do {
				System.out.println("Menu Jugueteria");
				System.out.println("1--Agregar juguete");
				System.out.println("2--Mostra juguetes");
				System.out.println("3--Buscar Juguete");
				System.out.println("4--Editar Nombre Juguete");
				System.out.println("5--Eliminar Juguete");
				
				leer = new Scanner(System.in);
				menu =  leer.nextInt();

				switch (menu) {
				case 1:
					try {
						System.out.println("Ingresa el codigo del nuevo juguete");
						leer = new Scanner(System.in);
						codigoBarras = leer.nextLong();
						
						System.out.println("Ingresa el nombre del nuevo juguete");
						leer = new Scanner(System.in);
						nombre = leer.nextLine();
								
						System.out.println("Ingresa el precio del juguete");
						leer = new Scanner(System.in);
						precio = leer.nextFloat();
								
						System.out.println("Ingrese la cantidad de stock");
						leer = new Scanner(System.in);
						stock = leer.nextInt();
								
						//Creando un nuevo juguete
						juguete = new Juguetes(codigoBarras, nombre, precio, stock);
						//Agregando el nuev juguete al hasmapp
						imp.guardarJuguete(juguete);
						System.out.println("Se guardo el nuevo juguete");
						
						
					} catch (Exception e) {
						System.out.println("Error al ingresar  los datos");
					}
					
					break;
				case 2:
					imp.mostraJuguete();
					break;
				case 3:
					try {
						System.out.println("Ingre el codigo de barras a buscar");
						leer = new Scanner(System.in);
						codigoBarras = leer.nextLong();		
						juguete = imp.buscarJuguete(codigoBarras);
						
						System.out.println("Juguete encontrado");
						System.out.println(juguete);
						
					} catch (Exception e) {
						System.out.println("No hay registros");
					}
					break;
				case 4:
						try {
							System.out.println("Ingre el codigo de barras a buscar");
							leer = new Scanner(System.in);
							codigoBarras = leer.nextLong();		
							juguete = imp.buscarJuguete(codigoBarras);
							System.out.println(juguete);
							
							System.out.println("Ingrese el nuevo precio");
							leer = new Scanner(System.in);
							precio = leer.nextFloat();
									
							//Actualizando el objeto
							juguete.setPrecio(precio);
							//Actualizando en el hash map
							imp.editarJuguete(juguete);
							
							System.out.println("Juguete editado");
							
						} catch (Exception e) {
							System.out.println("No se puede editar");
						}
					break;
				case 5:
						try {
							System.out.println("Ingre el codigo de barras a buscar");
							leer = new Scanner(System.in);
							codigoBarras = leer.nextLong();		
							juguete = imp.buscarJuguete(codigoBarras);
							System.out.println(juguete);
							
							imp.eliminarJuguete(codigoBarras);
							System.out.println("Jueguet eliminado");
							
						} catch (Exception e) {
							System.out.println("No se puede editar");
						}
					break;
				default:
					System.out.println("Opcion no disponible en el menu");
					break;
				}
				
			} while (menu < 6);
		} catch (Exception e) {
			System.out.println("Escoje una de las opciones disponibles");
		}

	}

}






























