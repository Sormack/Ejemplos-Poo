package zapatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PricipalZapatos {

	public static void main(String[] args) {
		//Variables a utilizar 
		String clave;
		String color;
		float precio;
		int existencia, indice, menuPrincipal;
		//Nuevo objeto instanciado como nullo 
		Zapatos producto = null;
		//Creando la lista que contendra todo los objetos  
		List<Zapatos> listaZapatos = new ArrayList<Zapatos>();
		//Lectura de datos inicializado como nullo
		Scanner lectura = null;
		// Menu principal
				do {
					//Cantidad de Opciones para el menu
					System.out.println("Menu principal");
					System.out.println("1--Alta de un nuevo zapato");
					System.out.println("2--Mostrando zapatos disponibles");
					System.out.println("3--Buscar zapato");
					System.out.println("4--Editar zapato");
					System.out.println("5--Eliminar zapato");
					System.out.println("6--Salir del programa");
					
					//Lectura de datos por teclado para el do while 
					lectura = new Scanner(System.in);
					menuPrincipal = lectura.nextInt();
					
					//Seleccion de opciones:
					switch (menuPrincipal) {
					case 1:
						try {
							//Lectura de datos para ingresar una nueva clave de zapato
							System.out.println("Ingrese la clave del producto:");
							lectura = new Scanner(System.in);
							clave = lectura.nextLine();
							//Lectura de datos para ingresar un nuevo color de zapato
							System.out.println("Ingrese el color del producto:");
							lectura = new Scanner(System.in);
							color = lectura.nextLine();
							//Lectura para ingresar un nuevo precio del producto
							System.out.println("Ingrese le precio del producto:");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();
							//Ingresando la cantidad de zapatos disponible 
							System.out.println("Ingrese la cantidad de productos:");
							lectura = new Scanner(System.in);
							existencia = lectura.nextInt();
							// Creando un nuevo objeto con el construcotr por parametros
							producto = new Zapatos(clave, color, precio, existencia);
							// Agregando el elemento a la lista
							listaZapatos.add(producto);
							System.out.println("Se guado el nuevo producto");

						} catch (Exception e) {
							System.out.println("Error al guardar" + e);
						}
						break;
					case 2:
						//Mostrando todo los elementos de la lista 
						System.out.println(listaZapatos);
						break;
					case 3:
						try {
							//Buscando un elemento de la lista mediante su indice 
							System.out.println("Ingres el indice a buscar:");
							lectura = new Scanner(System.in);
							indice = lectura.nextInt();
							producto = listaZapatos.get(indice);

							System.out.println("Se encontro el registor:" + producto);

						} catch (Exception e) {
							System.out.println("Error al busacar");
						}
						break;
					case 4:
						try {
							System.out.println("Ingres el indice a editar:");
							// Ingreso de los datos por teclado
							lectura = new Scanner(System.in);
							// Almacenamineto del indice en la variable indice
							indice = lectura.nextInt();
							// Busqueda del producto
							producto = listaZapatos.get(indice);
							System.out.println("Ingrese el nuevo color:");
							lectura = new Scanner(System.in);
							color = lectura.nextLine();
							producto.setColor(color);
							//Actualizando el registro del color
							System.out.println("Se encontro el registor:" + producto);
						} catch (Exception e) {
							System.out.println("Registro no encontrado");
						}
						break;
					case 5:
						System.out.println("Ingrese el indice del registro a eliminar:");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						//Eliminando el indice 
						listaZapatos.remove(indice);
						System.out.println("Se elimino el registro");
						break;
					case 6:
						break;
					}					
				}while(menuPrincipal < 6);

	}

}























