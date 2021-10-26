package ejercicio7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7. Leer un número entero y mostrar su tabla de multiplicar.

		int num=0, contador=0, tope=10, resultado;
		System.out.println("Bienvenido al programa de tablas de multiplicar");
		do {
		
		System.out.println("Diga un número entero para mostrar su tabla de multiplicar");
		System.out.println("Introduzca el 0 para salir");
		contador=0;
		num=Leer.datoInt();
		
		if(num!=0) {
			while(contador<=tope) {
				resultado=num*contador;
				System.out.printf("\n%d x %d = %d\n",num,contador,resultado);
				contador++;
			}
			}else {
				System.out.println("Es cero");
			}
		
		}while(num!=0 );
		
		System.out.println("Gracias por usar este programa.");
	}

}
