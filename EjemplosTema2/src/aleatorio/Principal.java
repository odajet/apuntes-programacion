package aleatorio;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random num = new Random (System.nanoTime());
		int aleatorio=0;
		int hasta=10, desde=0;
		
		System.out.println("Vamos a generar números aleatorios");
		System.out.println("Diga el mayor");
		hasta=Leer.datoInt();
		System.out.println("Diga el menor");
		desde=Leer.datoInt();
		aleatorio=num.nextInt(hasta-desde+1)+desde;
		System.out.println("Ha salido el: " + aleatorio);
		
	}

}
