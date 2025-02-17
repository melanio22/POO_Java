package ejerciciosBasicos;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la primera palabra");
		String input1 = scanner.nextLine();
		System.out.println("Introduce la segunda palabra");
		String input2 = scanner.nextLine();
		scanner.close();
		int menor = 0;
		int a=input1.length();
		String palabra1 = input1.toUpperCase();
		int b=input2.length();
		String palabra2 = input2.toUpperCase();
		
		//Pasar las dos palabras a dos listas
		char[] lista1 = palabra1.toCharArray();
		char[] lista2 = palabra2.toCharArray();

		//Comparar el tamaño de las dos palabras para compararlas mas tarde y tomar la pequeña como referencia
		if (a<=b) {
			menor = palabra1.length();
		}else{
			menor = palabra2.length();
		}
		
		for(int i = 0; i<menor; i++) {
			if(lista1[i]==lista2[i]) {
				
			}else {
				if(lista1[i]<lista2[i]) {
					System.out.println(input1+ " aparece antes que "+input2+" en el diccionario.");
					break;
				}else {
					System.out.println(input2+ " aparece antes que "+input1+" en el diccionario.");
					break;
				}
			}
		}
	}
}
