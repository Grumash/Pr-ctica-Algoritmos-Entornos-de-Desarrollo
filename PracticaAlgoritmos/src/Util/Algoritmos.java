package Util;

public abstract class Algoritmos {
	/**
	 * Dado un numero nos dara cual es el numero de fibonacci de es numero
	 * 
	 * @param num el numero dado para que se calcule
	 * @return nos retornara el numero de fibonnaci
	 */
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

	/**
	 * 
	 * Dado un numero nos calculara cual es su factorial
	 * 
	 * @param num el numero dado para que se calcule su factorila
	 * @return nos retornara el factorial del numero dado
	 */
	public static int factorial(int num) {

		int Factroial = num;

		for (int i = num - 1; i > 0; i--) {

			Factroial = Factroial * i;

		}

		return Factroial;
	}

	/**
	 * 
	 * Dado un numero nos calculara si es primo
	 * 
	 * @param num el numero dado para que se calcule di es primo
	 * @return nos retornara un true o un fasle suegun si el numero es primo o no
	 */
	public static boolean esprimo(int num) {
		boolean Esprimo = true;
		if (num % 2 == 0) {
			System.out.println("El número " + num + " no es primo");
			Esprimo = false;
		} else {
			System.out.println("El número " + num + " es primo");

			Esprimo = true;
		}
		return Esprimo;

	}

}
