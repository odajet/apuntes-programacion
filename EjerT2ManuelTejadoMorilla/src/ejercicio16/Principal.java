package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 16. Realizar una “mini-calculadora”, que realice las siguientes operaciones:
		 * suma, resta, multiplicación, división y decir si un número es par o impar. Se
		 * hará con un menú, y se pedirá en cada caso del switch los datos necesarios
		 * para realizar las operaciones. Se valorarán las comprobaciones que se hagan
		 * sobre los datos introducidos (por ejemplo, no dividir por cero).
		 */

		int opcion = 0, salida = 0, cantNum = 0, contador = 0, div = 0;
		double numero = 0, result = 0, resultMult = 1, denominador = 0;

		System.out.println("Bienvenido a la aplicación calculadora");
		do {

			System.out.println("Elige lo que quieres hacer");
			System.out.println("0. Salir");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Es par o impar");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				break;

			case 1:
				System.out.println("¿Cuántos números quiere sumar?");
				cantNum = Leer.datoInt();
				while (contador < cantNum) {
					System.out.println("Introduce un número");
					numero = Leer.datoDouble();
					result = result + numero;
					contador++;
				}
				System.out.printf("La suma es %.2f\n", result);
				contador = 0;
				result = 0;
				break;

			case 2:
				System.out.println("¿Cuántos números quiere restar?");
				cantNum = Leer.datoInt();
				System.out.println("Introduce un número");
				numero = Leer.datoDouble();
				result = numero;
				contador++;
				while (contador < cantNum) {
					System.out.println("Introduce un número");
					numero = Leer.datoDouble();
					result = result - numero;
					contador++;
				}
				System.out.printf("La resta es %.2f\n", result);
				contador = 0;
				result = 0;
				break;

			case 3:
				System.out.println("¿Cuántos números quiere multiplicar?");
				cantNum = Leer.datoInt();
				while (contador < cantNum) {
					System.out.println("Introduce un número");
					numero = Leer.datoDouble();
					resultMult = resultMult * numero;
					contador++;
				}
				System.out.printf("La multiplicación es %.2f\n", resultMult);
				contador = 0;
				resultMult = 1;
				break;

			case 4:
				System.out.println("Introduzca el numerador");
				numero = Leer.datoDouble();
				System.out.println("Introduzca el denominador");
				denominador = Leer.datoDouble();
				while (denominador == div) {
					System.out.println("No puedes dividir por 0. Introduce" + " otro número");
					denominador = Leer.datoDouble();
				}
				result = numero / denominador;
				System.out.printf("La división es %.2f\n", result);
				result = 0;
				break;

			case 5:
				System.out.println("Introduzca un número para determinar si es" + " par o impar");
				numero = Leer.datoDouble();
				if (numero % 2 == 0) {
					System.out.println("Es par");
				} else {
					System.out.println("Es impar");
				}
				break;

			default:
				System.out.println("Introduzca un número entre 0 y 5");

			}

		} while (opcion != salida);

		System.out.println("Gracias por usar la aplicación");
	}

}
