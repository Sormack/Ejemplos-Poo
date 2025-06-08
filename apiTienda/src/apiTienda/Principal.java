package apiTienda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lectura = null;

		long codigoBarras;
		String nombre;
		float precio;
		int existenicia, indice, menuPrincipal, subMenu, elemento;

		Productos producto = null;

		List<Productos> lista = new ArrayList<Productos>();

		// Menu principal
		do {
			System.out.println("Menu principal");
			System.out.println("1--Alta de productos");
			System.out.println("2--Mostra productos");
			System.out.println("3--Buscar producto");
			System.out.println("4--Editar producto");
			System.out.println("5--Eliminar producto");
			System.out.println("6--Buscar por nombre del producto");
			System.out.println("7--Buscar por precio");
			System.out.println("8--Calcular el dinero invertido");
			System.out.println("9--Eliminar un registro por nombre");
			System.out.println("10--Salir");
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

			switch (menuPrincipal) {
			case 1:
				try {
					System.out.println("Ingrese el codigo de barras:");
					lectura = new Scanner(System.in);
					codigoBarras = lectura.nextLong();

					System.out.println("Ingrese el nombre del producto:");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					System.out.println("Ingrese el precio del producto:");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingrese la cantidad de productos:");
					lectura = new Scanner(System.in);
					existenicia = lectura.nextInt();

					// Creando un nuevo objeto con el construcotr por parametros
					producto = new Productos(codigoBarras, nombre, precio, existenicia);

					// Agregando el elemento a la lista
					lista.add(producto);
					System.out.println("Se guado el nuevo producto");

				} catch (Exception e) {
					System.out.println("Error al guardar" + e);
				}
				break;

			case 2:
				System.out.println(lista);
				break;
			case 3:
				try {
					System.out.println("Ingres el indice a buscar:");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					producto = lista.get(indice);

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
					producto = lista.get(indice);
					System.out.println("Se encontro el registor:" + producto.getNombre());
					// Sub menu para editar el producto
					do {
						System.out.println("Submenu para editar:");
						System.out.println("1.Editar nombre");
						System.out.println("2.Editar precio");
						System.out.println("3.Regresar al menu principal");
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese el nuevo nombre:");
							lectura = new Scanner(System.in);
							nombre = lectura.nextLine();
							// Actualizar el objeto
							producto.setNombre(nombre);
							// Actualizar el registro en la lista
							lista.set(indice, producto);
							System.out.println("Elemento editado: " + producto);
							break;
						case 2:
							System.out.println("Ingrese el nuevo precio:");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();
							// Actualizar el objeto
							producto.setPrecio(precio);
							// Actualizar el registro en la lista
							lista.set(indice, producto);
							System.out.println("Elemento editado: " + producto);

							break;
						case 3:
							break;
						}
					} while (subMenu < 3);

				} catch (Exception e) {
					System.out.println("Error al busacar");
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice del registro a eliminar:");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					// Eliminando el indice
					lista.remove(indice);
					System.out.println("Se elimino el registro");
				} catch (Exception e) {
					System.out.println("Indice no encontrado");
				}

				break;
			case 6:
				try {
					System.out.println("Ingrese el nombre del producto");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					boolean bandera = false;
					// Buscar por nombre del producto
					for (Productos p : lista) {
						if (p.getNombre().equals(nombre)) {
							System.out.println(p);
							// Una vez encontrado el producto romper el ciclo para que no recorra todos los
							// registros
							bandera = true;
							break;
						}
					}
					// Cuado no exite un producto agregar banderas
					if (bandera == false) {
						System.out.println("No se encontro");
					}
				} catch (Exception e) {
					System.out.println("Producto no encontrado");
				}
				break;
			case 7:
				try {
					// Buscando por precio del producto
					// Introduciendo el precio mediante teclado
					System.out.println("Introduce el precio del producto a buscar:");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					for (Productos p : lista) {
						if (p.getPrecio() == precio) {
							// Solo mostrar el registro para no mostrar un mensaje repetido
							System.out.println(p);
						}
					}
				} catch (Exception e) {
					System.out.println("No hay coincidencias con este precio");
				}

				break;
			case 8:
				// Calculando la cantidad de dinero invertido
				precio = 0;
				for (Productos p : lista) {
					precio += p.getPrecio() * p.getExistenicia();
				}
				System.out.println("Total de dinero invertido: " + precio);
				break;
			case 9:
				// Eliminando un registro mediante el nombre
				try {
					System.out.println("Introduce el nombre del producto a eliminar:");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					for (Productos p : lista) {
						if (p.getNombre().equals(nombre)) {
							lista.remove(p);
							System.out.println("Elemento eliminado");
						}
					}

				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case 10:
				break;
			}
		} while (menuPrincipal < 10);
	}

}
