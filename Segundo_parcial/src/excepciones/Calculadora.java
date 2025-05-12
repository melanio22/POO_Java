package excepciones;

import java.util.Scanner;

public class Calculadora {

	public static double add (double a, double b) {
		return a+b;
	}
	public static double subtract (double a, double b) {
		return a-b;
	}
	public static double multiply (double a, double b) {
		return a*b;
	}
	public static double divide (double a, double b) throws ArithmeticException {
		if (b==0) {
			throw new ArithmeticException("No se puede dividir por cero");
			
		}
		return a/b;
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		double a = scanner.nextDouble();
		System.out.println("Introduce el segundo numero");
		double b = scanner.nextDouble();
		
		System.out.println(add(a,b));
		System.out.println(subtract(a,b));
		System.out.println(multiply(a,b));
		try {
			System.out.println(divide(a,b));
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		
		//implementar el switch para cada operacion y una excepcion de operacion ilegal
	}
}
}

