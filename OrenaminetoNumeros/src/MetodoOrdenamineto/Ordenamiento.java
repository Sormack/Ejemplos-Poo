package MetodoOrdenamineto;

import java.util.Arrays;

public class Ordenamiento {
	
	public void ordenarNumeros() {
		int numeros[] = new int[] {250,100,23,145,122,432,107,109,256,194,1};
		System.out.println("Lista de numeros a ordenar");
		for(int i = 0; i < numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("Lista de numeros ordenados");
		System.out.println("Con la clase Arrays y el metodo sort: ");
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
	}
	
	public void ordenamientoBurbuja() {
		int numeros[] = new int[] {250,100,23,145,122,432,107,109,256,194,1};
		//Primero se recorre la lista y este controla cuatas veces se recorrera la listas
		for(int i = 0;i<numeros.length-1;i++) {
			//Se vuelve a  recorrer la lista desde el indice 0
			for(int j = 0;j<numeros.length-1;j++) {
				//Se hace una comparacion donde se tiene los elemento de los indices j y j+1
				//Comparacion entre el inidice 0 y 1
				if(numeros[j] > numeros[j+1]) {
					//Si el valor de j es mayor al valor del siguiente indice se gurda en la variable auxiliar
					int auxiliar = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = auxiliar;
					//System.out.println(Arrays.toString(numeros));
				}
			}
		}
		System.out.println("Ordenamineto con el metodo burbuja");
		System.out.println(Arrays.toString(numeros));
	}
}
