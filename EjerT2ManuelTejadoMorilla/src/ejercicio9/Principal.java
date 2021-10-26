package ejercicio9;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9.Leer una secuencia de números, hasta que el usuario introduzca un número
		 * negativo y mostrar la suma total de dichos números sin contar el negativo
		 */
		int num = 0, tope = 0, resultado = 0;
		System.out.println("Bienvenido al programa que suma números positivos");
		do {
			System.out.println("Introduce un número");
			System.out.println("Pulse 0 para salir");
			num = Leer.datoInt();
			resultado = 0;
			if (num != tope) {
				while (num >= tope) {
					resultado = resultado + num;
					System.out.println("Introduce un número");
					num = Leer.datoInt();
				}
				System.out.printf("La suma es %d\n", resultado);
			}

		} while (num != tope);
		System.out.println("Gracias por usar este programa");
	}

}
