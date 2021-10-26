package ejercicio15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 15. Haga un programa de la interfaz de un cajero automático. Tendrá las
		 * opciones, ver saldo, retirar dinero, comprar entradas e ingresar dinero. En
		 * cada opción se pedirán los datos necesarios y se realizarán las operaciones
		 * adecuadas. El coste de las entradas se debe restar al saldo de dicha cuenta.
		 * La cuenta será creada por nosotros con un saldo inicial concreto.
		 */

		int opcion = 0, cantEntrad = 0, salir = 0;
		double saldo = 250, retirar = 0, entradaPre = 0, precioCompra = 0, ingreso = 0;

		System.out.println("Bienvenido a tu banco. Elija una opción");
		do {
			System.out.println("0. Salir.");
			System.out.println("1. Ver saldo.");
			System.out.println("2. Retirar dinero.");
			System.out.println("3.Comprar entradas.");
			System.out.println("4.Ingresar dinero.");

			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
				break;

			case 1:
				System.out.printf("Tu saldo es %.2f euros\n", saldo);
				break;

			case 2:
				System.out.println("¿Cuánto dinero desea retirar?");
				retirar = Leer.datoDouble();
				if (saldo < retirar) {
					System.out.println("Dinero insuficiente en tu cuenta");
				} else {
					saldo = saldo - retirar;
				}
				break;

			case 3:
				System.out.println("¿Cuánto vale una entrada?");
				entradaPre = Leer.datoDouble();
				System.out.println("¿Cuántas entradas quieres?");
				cantEntrad = Leer.datoInt();
				precioCompra = entradaPre * cantEntrad;
				if (saldo < precioCompra) {
					System.out.println("Saldo insuficiente");
				} else {
					saldo = saldo - precioCompra;
				}
				break;

			case 4:
				System.out.println("¿Cuánto dinero desea ingresar?");
				ingreso = Leer.datoDouble();
				saldo = saldo + ingreso;
				break;

			default:
				System.out.println("Introduzca un número entre 0 y 5");
			}
		} while (opcion != salir);

		System.out.println("Gracias por usar la aplicación. Vuelva cuando quiera");

	}

}
