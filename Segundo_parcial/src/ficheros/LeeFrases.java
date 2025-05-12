package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LeeFrases {

	public static void main(String[] args) {
		ArrayList<String> leer = new ArrayList<>();

		try {
//			hay que crear un File Reader primero y un Scanner despues
//			probar la funcion de BufferedReader combinada con FileReader
			
			FileReader fr = new FileReader("src/ficheros/frases.txt");
			Scanner sc = new Scanner(fr);
			
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				leer.add(linea);
			}
			System.out.println(leer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
