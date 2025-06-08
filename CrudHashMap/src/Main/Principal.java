package Main;

import java.time.LocalDate;
import java.util.Scanner;

import Clases.Videojuegos;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		Scanner lecturara = null;
		String nombre;//Esta es la llave 
		String genero;
		float precio;
		LocalDate fechaLan;
		
		Videojuegos video = null;
		
		int menuPrincipal;
		LogicaMetodos imp = new LogicaMetodos();
		
		do {
			System.out.println("Menu principal");
			System.out.println("1--Alta");
			System.out.println("2--Mostrar");
			System.out.println("3--Buscar");
			System.out.println("4--Editar");
			System.out.println("5--Eliminar");
			System.out.println("6--Salir");
			
			lecturara =new Scanner(System.in);
			menuPrincipal = lecturara.nextInt();
			switch (menuPrincipal) {
			case 1:
				try {
					System.out.println("Ingresa el nombre");
					lecturara = new Scanner(System.in);
					nombre = lecturara.nextLine();
					
					System.out.println("Ingresa el genero");
					lecturara = new Scanner(System.in);
					genero = lecturara.nextLine();
					
					System.out.println("Ingresa el precio");
					lecturara = new Scanner(System.in);
					precio= lecturara.nextFloat();
					
					System.out.println("Ingresa la fecha: año-mes-dia");
					lecturara = new Scanner(System.in);
					String  fecha = lecturara.nextLine();
					
					//Polimorfismo puro  o tambien como casteo 
					fechaLan = LocalDate.parse(fecha);
					
					//Creando el objeto
					video = new Videojuegos(nombre, genero, precio, fechaLan);
					//Guardando el nuevo objeto
					imp.gurdar(video);
					System.out.println("Se guardo el objeto");					
					
				} catch (Exception e) {
					System.out.println("No se pudo guardar");
				}
				break;
			case 2:
				imp.mostra();
				break;
			case 3:
				System.out.println("Ingrese el nombre a buscar");
				lecturara = new Scanner(System.in);
				nombre = lecturara.nextLine();
				
				video=  imp.buscar(nombre);
				System.out.println("Se encontro el: "+video);
				break;
			case 4:
				System.out.println("Ingrese el nombre a buscar");
				lecturara = new Scanner(System.in);
				nombre = lecturara.nextLine();
				
				video=  imp.buscar(nombre);
				System.out.println("Se encontro el: "+video);
				
				System.out.println("Ingrese el nuevo genero: ");
				lecturara = new Scanner(System.in);
				genero = lecturara.nextLine();
				
				//Actulizar el objeto
				video.setGenero(genero);
				//Actualiza en el hash map
				imp.editar(video);
				System.out.println("Editado de menera correcta");
				
			break;
				
			case  5:
				System.out.println("Ingrese el nombre a buscar");
				lecturara = new Scanner(System.in);
				nombre = lecturara.nextLine();
				
				//Eliminar 
				imp.eliminar(nombre);
				System.out.println("Elemento eliminado");
				
				break;
			case 6:
				break;
			}
		} while (menuPrincipal < 6);
		
		
		
	}

}









































