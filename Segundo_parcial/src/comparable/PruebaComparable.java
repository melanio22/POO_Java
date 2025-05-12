package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PruebaComparable {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante ("Zaba", 7);
		Estudiante e2 = new Estudiante ("Edu", 5);
		Estudiante e3 = new Estudiante ("Aner", 8);
		Estudiante e4 = new Estudiante ("Etorrita", 4);
		
		Estudiante2 e12 = new Estudiante2 ("Zaba", 7);
		Estudiante2 e22= new Estudiante2("Edu", 5);
		Estudiante2 e32 = new Estudiante2 ("Aner", 8);
		Estudiante2 e42 = new Estudiante2 ("Etorrita", 4);
		
		ArrayList<Estudiante> estudiantes= new ArrayList<Estudiante>();
		System.out.println(estudiantes);
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		estudiantes.add(e4);
		
		ArrayList<Estudiante2> estudiantes2= new ArrayList<Estudiante2>();
		System.out.println(estudiantes);
		estudiantes2.add(e12);
		estudiantes2.add(e22);
		estudiantes2.add(e32);
		estudiantes2.add(e42);
		System.out.println(estudiantes);
//		Collections.sort(estudiantes);
//		System.out.println(estudiantes);
//		System.out.println(e1.compareTo(e2));
//		System.out.println(e2.compareTo(e2));
		
		
		Comparator<Estudiante2> comparador = new Comparator<Estudiante2>() {  //Aqui dentro se pueden implmentar mas condiciones 
			@Override
			public int compare(Estudiante2 e1 , Estudiante2 e2) {
				int resultado = e1.nota - e2.nota;
				return resultado;
			}
		}; //al terminar comparable hay que poner ;
		
	Collections.sort(estudiantes2,comparador);  //compara la lista estudiantes2 que no tiene ninguna interfaz 
												//implementada y la ordena en base al objeto comparador
	System.out.println(estudiantes2);
	}

}
