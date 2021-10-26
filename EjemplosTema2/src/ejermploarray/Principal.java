package ejermploarray;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10, dos=2, num=0;
		
		int [] edades=new int [tam];
		System.out.println("Diga el número que quiere guardar");
		num=Leer.datoInt();
		edades[dos]=num;
		
		System.out.println(edades[dos]);
		
	}

}
