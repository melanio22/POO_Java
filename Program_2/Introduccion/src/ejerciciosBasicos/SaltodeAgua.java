package ejerciciosBasicos;

import java.util.Scanner;

public class SaltodeAgua {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("El ancho de la piscina");
		int a = entrada.nextInt();
		System.out.println("La largura de la piscina");
		int l = entrada.nextInt();
		System.out.println("La profundidad de la piscina");
		int p = entrada.nextInt();

		double volumen = a*l*p;
		System.out.println(volumen);

	}

}
