package restaurante;

public class Pescados extends Plato{
	String preparacion;

	public Pescados(String nombre, float precio, String preparacion) {
		super(nombre, precio);
		this.preparacion = preparacion;
	}
	
}
