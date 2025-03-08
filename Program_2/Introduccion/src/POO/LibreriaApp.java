package POO;

import java.util.ArrayList;
import java.util.List;

public class LibreriaApp {

	// Clase principal con el método main
	public class Libreria {
	    public static void main(String[] args) {
	        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle Falsa 123", "Ciudad X", "12345");

	        Libro libro1 = new Libro("1984", "George Orwell", "1949", "123-456-789");
	        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "1967", "987-654-321");

	        biblioteca.agregarLibro(libro1);
	        biblioteca.agregarLibro(libro2);

	        biblioteca.mostrarLibros();
	    }
	}
}
