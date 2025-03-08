package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Para copiar arrays usar Java.utils.CopyOf !!!!
// Clase Libro con encapsulación y constructor

class Libreria{
	private String nombre;
	private String calle;
	private String localidad;
	private String cp;
	private Libro[] libros = new Libro[4];
	
//METODOS
	//constructor
	public Libreria(String nombre, String calle, String localidad, String cp) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.localidad = localidad;
		this.cp = cp;
	}
	//getters y setters
	public void setNombre(){
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	//metodo para añadir un libro a la libreria 
	public void addBook(Libro[] libro) {
		for (int i=0;i<4;i++) {
			if (libro[i] == null){
				libros = Arrays.copyOf(libro, libro.length);
			}
			else if(libros[i]!= null){
				System.out.println("El espacio" + i + "está lleno");
			}
			else if(libros[i]!= null && i == 4){
				System.out.println("Ya no queda espacio para más libros");
			}
		}
		
	}
	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", calle=" + calle + ", localidad=" + localidad + ", cp=" + cp
				+ ", libros=" + Arrays.toString(libros) + "]";
	}
}
class Libro{
	//atributos de la clase libro
	private int ano;
	private String isbn;
	private String titulo;
	private String autor;

	//constructor de libro
	public Libro(String titulo, String autor, int ano, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.isbn = isbn;
	}
	
	//getters y setters
	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Libro [ano=" + ano + ", isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
}