package ejercicio12;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 12. Se desea realizar un programa que gestione las notas de un alumno del
		 * centro. Para ello, se necesita leer las notas de las 6 asignaturas de un solo
		 * alumno y mostrar por pantalla al final, la nota media y el número de
		 * suspensos que tiene. No usar una variable para cada nota, ni es necesario
		 * mostrar las notas de cada asignatura, solo la media y el número de suspensos.
		 */
		double nota = 0, resultado = 0, media = 0, notaMax = 10, notaMin = 0;
		int contador = 0, tope = 6, salida = 11, suspensos = 0, suspender = 5;
		System.out.println(
				"Bienvenido al programa que calcula la media de tus notas y te muestra" + " el número de suspensos");
		do {

			System.out.println("Introduzca una nota");
			System.out.println("Introduzca el 11 para salir");
			contador = 0;
			resultado = 0;
			suspensos = 0;
			nota = Leer.datoDouble();

			if (nota <= notaMax && nota >= notaMin) {
				contador++;
				if (nota < suspender) {
					suspensos++;
				}
				resultado = resultado + nota;
				while (contador < tope) {
					System.out.println("Introduce otra nota");
					nota = Leer.datoDouble();
					if (nota < suspender) {
						suspensos++;
					}
					resultado = resultado + nota;
					contador++;
				}
				media = resultado / tope;
				System.out.printf("Su nota media es %.2f y ha suspendido %d asignaturas\n", media, suspensos);
			} else if (nota != salida) {
				System.out.println("Error, introduzca una nota entre 0 y 10");
			} else {
				System.out.println("Has salido");
			}

		} while (nota != salida);

		System.out.println("Gracias por usar este programa.");
	}

}
