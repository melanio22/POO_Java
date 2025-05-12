package ordenarStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenarStrings {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList();
		
		l.add("Perro");
		l.add("aloha");
		l.add("Salto");
		l.add("burbuja");
		l.add("abeja");
		
		
		
		Comparator<String> ComparaMayuMinus = new Comparator<String>{}{
			@Override
			public int compare(String a1, String a2) {				return a1.toLowerCase(8z).compareTo()  //ARREGLAR EL DESASTRE ESTE
			}
		};
		
		
//		Collections.sort(l);
//		System.out.println(l);
	}

}
