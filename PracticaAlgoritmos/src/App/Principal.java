package App;

import java.util.Random;

import Util.*;

public class Principal {

	public static void main(String[] args) {

		// Creamos un array de 5 numeros aleatorios entre 1 y 10

		int[] numeros = new int[5];
		Random ran = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ran.nextInt(10) + 1;
		}

		/**
		 * Creamos un array que usara los numeros generados por el array anterior y nos
		 * dira su fibonacci usando la funcion de fibonacci creada en la clase
		 * algoritmos
		 **/
		int[] numeroFibonacci = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {

			numeroFibonacci[i] = Algoritmos.fibonacci(numeros[i]);

		}


		/**
		 * Creamos un array que usara los numeros generados por el array anterior y nos
		 * dira el factorial usando la funcion creada en la clase algoritmos
		 **/
		int[] resultadoFactorial = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
		}

		/**
		 * Creamos un array que usara los numeros generados por el array anterior y nos
		 * dira el si el numero dado es primo o no
		 */

		boolean[] resultadoPrimos = new boolean[numeros.length];
		for (int i = 0; i < numeros.length; i++) {

			resultadoPrimos[i] = Algoritmos.esprimo(numeros[i]);


		}

	}
}
