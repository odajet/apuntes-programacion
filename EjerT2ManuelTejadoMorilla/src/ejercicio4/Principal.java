package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. Leer un número y mostrar por la salida estándar si dicho número es o no par.
		
		double num=0;
		int par=2;
		
		System.out.println("Bienvenido a la aplicación que te dice si un número es par"
				+ " o impar");
		System.out.println("Introduce un número");
		num=Leer.datoDouble();
		
		if (num%par==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		
		System.out.println("Gracias por usar esta aplicación, hasta pronto");
		
	}

}
