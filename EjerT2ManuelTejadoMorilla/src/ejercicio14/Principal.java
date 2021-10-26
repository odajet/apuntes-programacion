package ejercicio14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 14. Realizar un programa que calcule el salario mensual de un vendedor. Este
		 * será el resultado de un sueldo fijo 1000€ mensuales más un porcentaje de las
		 * ventas realizadas. Lo que se cobra por ventas se calculará mediante el 20 %
		 * de lo vendido en total al mes.
		 */

		int fijo = 1000, porcentaje = 20, calculo = 100, opcion = 0, salida = 0;
		double sueldo = 0, ventas = 0;

		System.out.println("Bienvenido al programa que calcula el salario" + " de un vendedor");
		do {
			System.out.println("Pulse 0 para salir u otro número para continuar");
			opcion = Leer.datoInt();
			if (opcion != salida) {
				System.out.println("¿Cuánto has ganado con las ventas?");
				ventas = Leer.datoDouble();
				if (ventas != salida) {
					sueldo = fijo + (ventas * porcentaje) / calculo;
					System.out.printf("Tu sueldo es %.2f euros\n", sueldo);
				} else {
					System.out.printf("Tu sueldo es %d euros\n", fijo);
				}
			}
		} while (opcion != salida);

		System.out.println("Gracias por usar el programa");
	}

}
