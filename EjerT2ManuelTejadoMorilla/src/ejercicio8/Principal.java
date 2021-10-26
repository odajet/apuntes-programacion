package ejercicio8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8. Leer una secuencia de 10 números y mostrar solo la suma y el producto de
		// todos ellos.
		int num = 0, contador = 0, resultado = 0, resultadoProd = 1, tope = 10, opcion = 0, salida = 0;
		System.out.println("Bienvenido al programa que te pide 10 números y"
		+ " te muestra su suma y su producto");
		do {
			System.out.println("Pulse 0 para salir u otro número para" + " continuar");
			contador = 0;
			resultado = 0;
			resultadoProd = 1;
			opcion = Leer.datoInt();
			if (opcion != salida) {
				while (contador < tope) {
					System.out.println("Introduzca un número " + (contador+1));
					num = Leer.datoInt();
					resultado = resultado + num;
					resultadoProd = resultadoProd * num;
					contador++;
				}

				System.out.printf("Suma: %d y Multiplicación: %d", resultado, resultadoProd);
				System.out.println("\nGracias por usar este programa.");
			}
		} while (opcion != salida);
		System.out.println("Hasta pronto");
	}

}
