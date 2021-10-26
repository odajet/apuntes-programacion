package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por 
		pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes 
		(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
		PLANETA Mercurio Venus Tierra Marte Júpiter Saturno Urano Neptuno
		EQUIVALENCIA 0.38 0.91 1.00 0.38 2.53 1.06 0.92 1.2*/
		
		int opcion=0;
		double peso=0, pesoFinal=0, equiMer=0.38, equiVen=0.91, equiTie=1.00, equiMar=0.38, equiJup=2.53,
				equiSat=1.06, equiUra=0.92, equiNep=1.2;
		
		System.out.println("Bienvenido a la aplicación que calcula tu peso en"
				+ " diferentes planetas");
		
		System.out.println("Elige el planeta donde quieras saber tu peso:");
		System.out.println("1. Mercurio");
		System.out.println("2. Venus");
		System.out.println("3. Tierra");
		System.out.println("4. Marte");
		System.out.println("5. Júpiter");
		System.out.println("6. Saturno");
		System.out.println("7. Urano");
		System.out.println("8. Neptuno");
		
		opcion=Leer.datoInt();
		
		switch (opcion) {
		
			case 1:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiMer;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
			case 2:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiVen;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
			case 3:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiTie;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
			case 4:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiMar;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
			case 5:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiJup;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
			case 6:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiSat;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
			case 7:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiUra;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
			case 8:
				System.out.println("¿Cuánto pesas?");
				peso=Leer.datoDouble();
				pesoFinal=peso*equiNep;
				System.out.printf("Tu peso es %.2f kg", pesoFinal);
				break;
				
				default:
					System.out.println("Error. Introduce un número entre 1 y 7");
		
		}
		
		System.out.println("\nGracias por utilizar este programa.");
		
	}

}
