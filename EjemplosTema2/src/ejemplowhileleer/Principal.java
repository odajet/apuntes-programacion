package ejemplowhileleer;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=0, tope=0, opcion=0;
	
	do {
	
	System.out.println("¿Hasta dónde quiere contar?");
	num=0;
	tope=Leer.datoInt();
		
		while(num<tope) {
			num++;
			System.out.println(num);
			/*otra forma
			while(condicion<10){
			
			 System.out.println("El número es: " + (condicion+1));
			 condicion++;
			 }
			 
			*/
		}
		
		System.out.println("¿Quiere continuar? Pulse 0 para salir");
		
		opcion=Leer.datoInt();
		
	}while (opcion!=0);
		
	}

}