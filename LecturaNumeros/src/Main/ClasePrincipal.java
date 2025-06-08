package Main;

import java.util.Scanner;

import MetodoComparacionNumeros.ComparacionNumeros;

public class ClasePrincipal {

	public static void main(String[] args) {
		int a,b,c;
		Scanner leer =  new Scanner(System.in);
		System.out.println("Introducel el primer numero:");
		a = leer.nextInt();
		System.out.println("Introducel el segundo numero:");
		b = leer.nextInt();
		System.out.println("Introducel el tercer numero:");
		c = leer.nextInt();
		
		ComparacionNumeros numeros = new ComparacionNumeros();
		numeros.comparandoNumeros(a, b, c);
	}

}
