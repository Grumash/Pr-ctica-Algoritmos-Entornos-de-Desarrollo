package App;

import java.util.Random;

import Util.*;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos  un array de 5 numeros aleatorios entre 1 y 10

		int[] numeros = new int[5];
		Random ran = new Random();
		for (int i = 0; i < numeros.length; i++) {
		numeros[i] = ran.nextInt(10) + 1;
		}
		
		/** Creamos un array que usara los numeros generados por el array anterior y nos dira su fibonacci 
		 * usando la funcion de fibonacci creada en la clase algoritmos
		**/
		
		for (int i = 0; i < numeros.length; i++) {
		    int numeroFibonacci = Algoritmos.fibonacci(numeros[i]);
		    System.out.println((i + 1)+" El fibonaccci del número " + numeros[i] + "  es : " + numeroFibonacci);
		}

	}

}
