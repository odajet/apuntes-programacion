package ejercicio13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 13. Un trabajador necesita calcular su salario semanal, el cual se obtiene de
		 * la siguiente manera: Si trabaja 40 horas o menos se le paga 16 euros por
		 * hora, si trabaja más de 40 horas se le paga 16 euros por cada una de las
		 * primeras 40 horas y 20 euros por cada hora extra. El programa deberá pedir al
		 * usuario el número de horas trabajadas por el obrero en total y mostrar el
		 * salario que le corresponde.
		 */
		int horas = 0, limite = 40, salida = 0, normales = 16, extra = 20, horasExtra = 0, horasNorm = 0;
		double salarioNorm = 0, total = 0;
		System.out.println("Bienvenido al programa que calcula tu salario mensual");
		do {
			System.out.println("¿Cuántas horas has trabajado esta semana? Si quieres" + " salir pulsa 0");
			horas = Leer.datoInt();
			if (horas != salida) {
				if (horas <= limite) {
					salarioNorm = horas * normales;
					System.out.printf("Te corresponden %.2f euros\n", salarioNorm);
				} else {
					horasExtra = (horas - limite) * extra;
					horasNorm = limite * normales;
					total = horasExtra + horasNorm;
					System.out.printf("Te corresponden %.2f euros\n", total);
				}
			}
		} while (horas != salida);

		System.out.println("Gracias por usar este programa");

	}

}
