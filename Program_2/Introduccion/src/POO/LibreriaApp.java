package POO;
public class LibreriaApp {

//Clase principal con el método main
	public static void main(String[] args) {
	    Libreria Libreria1 = new Libreria("Biblioteca Central", "Calle Falsa 123", "Ciudad X", "12345"); //Falta añadir el array string de los libros que se asignan a la libreria
	
	    Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, "9780544003415");
	    Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "9780307350488");
	    Libro libro3 = new Libro("1984", "George Orwell", 1949, "9780451524935");
	    
	    
	    Libreria1.añadirLibro(libro1);
	    Libreria1.añadirLibro(libro2);
	    Libreria1.añadirLibro(libro3);
	    System.out.println(Libreria1);
	}
}