package MetodoComparacionNumeros;

public class ComparacionNumeros {
	public void comparandoNumeros(int a,int b, int c) {
		if(a > b && a > c) {
			System.out.println("El primer numero es el mayor");
			System.out.println("El numero " + a +" es el mayor");
		}else if(b > c) {
			System.out.println("El segundo numero es el mayor");
			System.out.println("El numero " + b +" es el mayor");

		}else {
			System.out.println("El tercer numero es el mayor");
			System.out.println("El numero " + c +" es el mayor");
		}
	}
}
