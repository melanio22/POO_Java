package ficheros;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EscribeFrases {

	public static void main(String[] args) {

		ArrayList<String> frases = new ArrayList<>();
		
		frases.add("Primera linea");
		frases.add("Segunda linea");
		frases.add("Tercera linea");
		frases.add("Cuarta linea");
		
		System.out.println(frases);
		
		//Creacion del archivo
		try {
			PrintWriter pw = new PrintWriter("src/ficheros/frases.txt");
			for (int i=0;i<frases.size();i++) {
				pw.write(frases.get(i));
				pw.write("\n");
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
