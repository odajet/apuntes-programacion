package ejermploarray2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=4, dos=2, num=0;
		
		int [] edades=new int [tam];
		//for para cargar el array
		for (int i=0;i<edades.length;i++) {
			System.out.print("Diga un número");
			edades[i]=Leer.datoInt();
		}
		//bucle para mostrar el array
		for(int i=0;i<edades.length;i++) {
			System.out.println("El número es: " + edades[i]);
		}
	}

}