package openJai;

import java.util.Date;
import java.util.ArrayList;

public class Desarrollador extends Empleado {
	private ArrayList<String> lenguajes;

	
	public Desarrollador(String nombre, Date fechaIncorporacion, ArrayList<String> lenguajes) {
		super(nombre, fechaIncorporacion);
		this.lenguajes = new ArrayList<>(lenguajes); //Hay que hacer que se puedan meter al arrayList los diferentes lenguajes
	}


	@Override
	public String toString() {
		return "Desarrollador [lenguajes=" + lenguajes + "]";
	}	
}
