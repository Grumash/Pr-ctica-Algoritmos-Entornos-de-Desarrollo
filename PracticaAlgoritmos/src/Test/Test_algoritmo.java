package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.Algoritmos;

class Test_algoritmo {

	void fibonacci() {
		Algoritmos algoritmos;
		int fibonacciesperada = 1;
		int fibonacciResultado = Algoritmos.fibonacci(1);
		assertEquals(fibonacciesperada, fibonacciResultado);

	}

	@Test
	void factorial() {
		Algoritmos algoritmos;
		int Factorialesperada = 6;
		int factorialResultado = Algoritmos.factorial(3);
		assertEquals(Factorialesperada, factorialResultado);
	}

	@Test
	void esPrimos() {
		Algoritmos algoritmos;
		boolean EsPrimosesperada = false;
		boolean EsPrimosResultado = Algoritmos.esprimo(4);
		assertEquals(EsPrimosesperada, EsPrimosResultado);
	}
}
