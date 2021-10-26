package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3.Leer un número que será la cantidad de dinero que una persona quiere retirar de 
		su cuenta bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad 
		que se quiere retirar es mayor que el saldo de la cuenta y el nuevo saldo si se ha 
		podido retirar.*/
		
		double cuenta=100, cantidad=0, resultado=0;
		
		System.out.println("Bienvenido a la aplicación que simula tu banco");
		System.out.println("¿Cuánto dinero quiere sacar?");
		cantidad=Leer.datoDouble();
		
		if(cantidad>cuenta) {
			System.out.println("Imposible sacar esa cantidad. No hay dinero suficiente"
					+ " en tu cuenta");
		}else {
			resultado=cuenta-cantidad;
			System.out.printf("Tu cuenta actualmente tiene %.2f euros", resultado);
		}
		
		System.out.println("\nGracias por usar esta aplicación");
		
	}

}
