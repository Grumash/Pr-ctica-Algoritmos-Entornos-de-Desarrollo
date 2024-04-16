package Util;

public abstract class Algoritmos {

	public static int fibonacci(int num) {

		if (num <= 1) {
			return num;

		} else {
			int n1 = 0;
			int n2 = 1;

			for (int i = 2; i <= num; i++) {
				int fibo = n1 + n2;
				n1 = n2;
				n2 = fibo;

			}
			return n2;
		}

	}

	public static int factorial(int num) {

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
