package ejerciciosBasicos;

import java.util.Scanner;

public class Consonantes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = scanner.nextLine();
		String mayus = frase.toUpperCase();
		Char[] lista = new Char[mayus.length()];
		
		for (int i = 0; i<mayus.length(); i++) {
			lista = mayus.charAt(i);
			//TERMINAR

		}
		
			
		int contador = 0;
		
		for	(int i=0; i<mayus.length();i=0){
			if ((mayus[i] !="A") && (mayus[i]!="E") && (mayus[i] !="I")&&(mayus[i] !="O")&&(mayus[i] !="U")){
					contador++;
			}
		}
		System.out.println("Tu frase tiene: "+contador);
	}

}
