package Metodo;

public class NumeroImpar {

	public void numeroImpar() {
		int impar = 0;
		for (int i = 100; i > 1; i--) {
			impar = i % 2;
			if (impar > 0) {
				System.out.println(i);
			}
		}

	}

}
