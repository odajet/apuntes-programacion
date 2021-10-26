package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe mostrar un
		mensaje de error si el segundo es cero ANTES de hacer la operación. Mostrar el resultado de
		la división con dos decimales si no lo es.*/
		
		double numerador=0,denominador=0, division=0;
		int condicion=0;
		
		System.out.println("Bienvenido al programa que divide dos números. Así que por favor,"
				+ " introduzca el numerador");
		numerador=Leer.datoDouble();
		System.out.println("Ahora introduzca el denominador");
		denominador=Leer.datoDouble();
		
		if(denominador==condicion) {
			System.out.println("Error, no se puede dividir por cero");
		}else {
			division=numerador/denominador;
			System.out.printf("La división es %.2f", division);
		}
		
		System.out.println("\nGracias por usar la aplicación. Vuelva pronto.");
		
	}

}
