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

		return 0;
	}


	public static boolean esprimo (int num) {
		 boolean eEsprimo= true;
	     if(num/2 == 0) {
	        System.out.println("El número"+num+" es primo");
	        eEsprimo=true;
	     } else {
	        System.out.println("El número "+num+" no es primo");
	        eEsprimo=false;
	     }
		 return true;
		
	}

}
