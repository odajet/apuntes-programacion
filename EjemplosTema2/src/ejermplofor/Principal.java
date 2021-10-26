package ejermplofor;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope=0;
		String nombre;
		
		System.out.println("¿Hasta dónde contamos?");
		
		tope=Leer.datoInt();
		
		System.out.println("¿Cómo te llamas?");
		
		nombre=Leer.dato();
		
		for(int i=0; i<tope; i++) {
			System.out.println("Numero " + (i+1) +": " + nombre);
			for (int j=0; j<tope; j++) {
				System.out.println("Hola");
			}
		}
	}

}
