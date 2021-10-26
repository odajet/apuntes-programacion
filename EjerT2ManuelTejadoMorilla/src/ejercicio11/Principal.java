package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 11. Escriba un programa al que se le pasen dos números a y b y calcule y
		 * muestre la operación ab . No se puede usar la función pow ().
		 */
		int opcion = 0, salida = 0, a = 0, b = 0, contador = 0, resultado = 1;
		System.out.println("Bienvenido al programa que te pide la base y" + " el exponente y realiza la operación");
		do {
			System.out.println("Introduce 0 para salir u otro número para continuar");
			opcion = Leer.datoInt();
			if (opcion != salida) {
				resultado = 1;
				contador = 0;
				System.out.println("Introduce la base");
				a = Leer.datoInt();
				System.out.println("Introduce el exponente");
				b = Leer.datoInt();
				while (contador < b) {
					resultado = resultado * a;
					contador++;
				}
				System.out.printf("El resultado de elevar %d a %d es: " + "%d\n", a, b, resultado);
			}

		} while (opcion != salida);

		System.out.println("Gracias por utilizar este programa");

	}

}
