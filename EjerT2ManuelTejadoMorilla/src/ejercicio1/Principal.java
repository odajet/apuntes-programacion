package ejercicio1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1=0, numero2=0;
		
		System.out.println("Introduce un número:");
		numero1=Leer.datoInt();
		
		System.out.println("Introduce otro número");
		numero2=Leer.datoInt();
		
		if (numero1<numero2) {
			System.out.println("El numero 2 es mayor");
		}else if(numero1>numero2){
			System.out.println("El numero 1 es mayor");
		}else{
			System.out.println("Los números son iguales");
		}
		
		System.out.println("Gracias por usar este programa");
		
	}

}
