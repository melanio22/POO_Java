package ejerciciosBasicos;
import java.lang.Math;
import java.util.Scanner;

public class HeronDeAlejandria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el lado A: ");
		double a = entrada.nextDouble(); 
		System.out.println("Introduce el lado B: ");
		double b = entrada.nextDouble(); 
		System.out.println("Introduce el lado C: ");
		double c = entrada.nextDouble(); 
		
		double s = a+b+c;
		double area = Math.sqrt(s);
		System.out.printf("El area del triangulo son %f m2",area);
		
	}

}


