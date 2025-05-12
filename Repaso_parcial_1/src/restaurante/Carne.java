package restaurante;

public class Carne extends Plato {
	String punto;

	public Carne(String nombre, float precio, String punto) {
		super(nombre, precio);
		this.punto = punto;
	}
	
}
