package ejemplodowhile;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido al bucle");
		int opcion=0;
		
		do {
			System.out.println("Pulse la sala que quiera:");
			System.out.println("1. Para matrix");
			System.out.println("2. Para el señor de los anillos");
			System.out.println("3. Para Doraemon");
			System.out.println("0. Para salir");
			
			opcion = Leer.datoInt();	
			
			switch(opcion) {
				case 0:
					System.out.println("Ha decidido salir");
					break;
				case 1:
					System.out.println("Sala 1");
					break;
				case 2:
					System.out.println("Sala 2");
					break;
				case 3:
					System.out.println("Sala 3");
					break;
				default:
					System.out.println("Opción incorrecta");
					break;
			}
			
		}while(opcion!=0);
		
		System.out.println("Gracias por usar el programa. Hasta luego");
		
	}

}
