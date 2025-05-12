package filtrarFechas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FiltrarFechas {

	public static void main(String[] args) {
		ArrayList<LocalDate> fechas = new ArrayList();
		fechas.add(LocalDate.of(2015, 05, 20));
		fechas.add(LocalDate.of(2020, 03, 13));
		fechas.add(LocalDate.of(2015, 05, 17));
		fechas.add(LocalDate.of(2017, 12, 01));
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dia: ");
		int dia = entrada.nextInt();
		
		System.out.println("Mes: ");
		int mes = entrada.nextInt();
		
		System.out.println("Año: ");
		int anio = entrada.nextInt();
		
		for (LocalDate LocalDate : fechas) {
			//iterar sobre fechas buscando el mes 
		}
	}

}
