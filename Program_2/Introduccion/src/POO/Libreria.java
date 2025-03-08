package POO;

import java.util.ArrayList;
import java.util.List;


//Para copiar arrays usar Java.utils.CopyOf !!!!
// Clase Libro con encapsulación y constructor
class Libro {
    private String titulo;
    private String autor;
    private String ano;
    private String isbn;

    public Libro(String titulo, String autor, String ano, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAno() {
        return ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + ano);
        System.out.println("ISBN: " + isbn);
    }
}

// Clase Biblioteca que almacena una lista de libros
class Biblioteca {
    private String nombre;
    private String calle;
    private String localidad;
    private String cp;
    private List<Libro> libros;

    public Biblioteca(String nombre, String calle, String localidad, String cp) {
        this.nombre = nombre;
        this.calle = calle;
        this.localidad = localidad;
        this.cp = cp;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }
}

