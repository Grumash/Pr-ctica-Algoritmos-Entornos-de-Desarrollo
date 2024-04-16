package Util;

public abstract class Algoritmos {

	public int fibonacci() {

		return 0;
	}

	public int factorial(int num) {

		int Factroial = num;

		for (int i = num - 1; i > 0; i--) {

			Factroial = Factroial * i;

		}

		return Factroial;
	}

	public static boolean esprimo(int num) {
		boolean Esprimo = true;
		if (num / 2 == 0) {
			System.out.println("El número" + num + " es primo");
			Esprimo = true;
		} else {
			System.out.println("El número " + num + " no es primo");
			Esprimo = false;
		}
		return Esprimo;

	}

}
