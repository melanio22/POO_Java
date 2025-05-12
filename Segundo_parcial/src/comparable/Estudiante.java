package comparable;

public class Estudiante implements Comparable<Estudiante>{

	String nombre;
	int nota;
	
	public Estudiante(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	@Override
	public int compareTo(Estudiante e) {
		return this.nota - e.nota; //compara en base a la nota, en este caso de menor a mayor
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
}
