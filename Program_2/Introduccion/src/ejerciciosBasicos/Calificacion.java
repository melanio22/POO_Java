package ejerciciosBasicos;

import java.util.Scanner;
import java.lang.Math;

public class Calificacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nota: ");
		double nota = entrada.nextDouble();
		
		int notaRedondeada = (int) Math.round(nota);
		
		switch (notaRedondeada){
			case 0: case 1: case 2: case 3: case 4:
				System.out.println("Suspenso");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6: case 7:
				System.out.println("Bien");
				break;
			case 8:
				System.out.println("Notable");
				break;
			case 9: case 10:
				System.out.println("Sobresaliente");
				break;
			
		}
	}

}
