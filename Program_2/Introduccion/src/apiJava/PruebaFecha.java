package apiJava;

import java.time.LocalDate;
import java.util.Scanner;

public class PruebaFecha {
	Scanner scanner = new Scanner(System.in);
	int dia = scanner.nextInt();
	LocalDate.day = dia;
	
	String mes = scanner.nextLine();
	int ano = scanner.nextInt();
	
	LocalDate hoy = LocalDate.now();
}
