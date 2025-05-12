package agenda;

import java.util.ArrayList;

public class AppAgenda {

	public static void main(String[] args) {
		Contacto c1 = new Contacto ("Iker", 623891203,"ikerz@gmail.com");
		Contacto c2 = new Contacto ("Aner", 623891203,"anerf@gmail.com");
		Contacto c3 = new Contacto ("Markel", 623891203,"markelv@gmail.com");
		Contacto c4 = new Contacto ("Paul", 623891203,"paulz@gmail.com");
		
		ArrayList<Contacto> contactos = new ArrayList<Contacto>();
		
		 contactos.agregarContacto(contactos,c1);
	}

}
