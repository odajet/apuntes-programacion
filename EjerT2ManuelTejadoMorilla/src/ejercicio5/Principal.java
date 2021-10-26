package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada 
		una. Se debe leer la sala deseada y mostrar:
		a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo, 
		sala vip, sala 3D, sala normal y sala para niños).
		b. Pedir el número de entradas.
		c. Calcular el precio final y mostrarlo.*/
		int opcion=0, opcion2=0, numEntradas=0;
		double vip=12, tresD=8, normal=6, infantil=3, total=0;
		System.out.println("Bienvenido al cine Los Arcos. Elija la sala que desee:");
		System.out.println("1. Space Jam 2");
		System.out.println("2. A todo gas 16");
		System.out.println("3. Las Tortugas Ninja");
		System.out.println("4. Terminator");
		
		opcion=Leer.datoInt();
		
		switch (opcion) {
			case 1:
				System.out.println("¿Qué sala desea para ver Space Jam 2?");
				System.out.printf("1.Sala VIP %.2f euros",vip);
				System.out.printf("\n2.Sala 3D %.2f euros",tresD);
				System.out.printf("\n3.Sala normal %.2f euros",normal);
				System.out.printf("\n4.Sala infantil %.2f euros", infantil);
				opcion2=Leer.datoInt();
				
				switch(opcion2) {
					case 1:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*vip;
						System.out.printf("Son %.2f euros",total);
						break;
					case 2:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*tresD;
						System.out.printf("Son %.2f euros",total);
						break;
					case 3:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*normal;
						System.out.printf("Son %.2f euros",total);
						break;
					case 4:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*infantil;
						System.out.printf("Son %.2f euros",total);
						break;
						
					default:
						System.out.println("Error. Introduce un número entre 1 y 4");
						break;
				}
				break;
			
			case 2:
				System.out.println("¿Qué sala desea para ver A todo gas 16?");
				System.out.printf("1.Sala VIP %.2f euros",vip);
				System.out.printf("\n2.Sala 3D %.2f euros",tresD);
				System.out.printf("\n3.Sala normal %.2f euros",normal);
				System.out.printf("\n4.Sala infantil %.2f euros", infantil);
				opcion2=Leer.datoInt();
				
				switch(opcion2) {
					case 1:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*vip;
						System.out.printf("Son %.2f euros",total);
						break;
					case 2:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*tresD;
						System.out.printf("Son %.2f euros",total);
						break;
					case 3:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*normal;
						System.out.printf("Son %.2f euros",total);
						break;
					case 4:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*infantil;
						System.out.printf("Son %.2f euros",total);
						break;
					
					default:
						System.out.println("Error. Introduce un número entre 1 y 4");
						break;
			}
				break;
			case 3:
				System.out.println("¿Qué sala desea para ver Las Tortugas Ninja?");
				System.out.printf("1.Sala VIP %.2f euros",vip);
				System.out.printf("\n2.Sala 3D %.2f euros",tresD);
				System.out.printf("\n3.Sala normal %.2f euros",normal);
				System.out.printf("\n4.Sala infantil %.2f euros", infantil);
				opcion2=Leer.datoInt();
				
				switch(opcion2) {
					case 1:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*vip;
						System.out.printf("Son %.2f euros",total);
						break;
					case 2:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*tresD;
						System.out.printf("Son %.2f euros",total);
						break;
					case 3:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*normal;
						System.out.printf("Son %.2f euros",total);
						break;
					case 4:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*infantil;
						System.out.printf("Son %.2f euros",total);
						break;
						
					default:
						System.out.println("Error. Introduce un número entre 1 y 4");
						break;
				}
				break;
				
			case 4:
				System.out.println("¿Qué sala desea para ver Terminator?");
				System.out.printf("1.Sala VIP %.2f euros",vip);
				System.out.printf("\n2.Sala 3D %.2f euros",tresD);
				System.out.printf("\n3.Sala normal %.2f euros",normal);
				System.out.printf("\n4.Sala infantil %.2f euros", infantil);
				opcion2=Leer.datoInt();
				
				switch(opcion2) {
					case 1:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*vip;
						System.out.printf("Son %.2f euros",total);
						break;
					case 2:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*tresD;
						System.out.printf("Son %.2f euros",total);
						break;
					case 3:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*normal;
						System.out.printf("Son %.2f euros",total);
						break;
					case 4:
						System.out.println("¿Cuántas entradas desea?");
						numEntradas=Leer.datoInt();
						total=numEntradas*infantil;
						System.out.printf("Son %.2f euros",total);
						break;
						
					default:
						System.out.println("Error. Introduce un número entre 1 y 4");
						break;
				}
				break;
				
				default:
					System.out.println("Error. Introduzca un número entre 1 y 4");
		}
		
		System.out.println("\nGracias por usar esta aplicación. Vuelva pronto");
		
	}

}
