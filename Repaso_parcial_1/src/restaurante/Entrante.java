package restaurante;

public class Entrante extends Plato {
	int uds;

	public Entrante(String nombre, float precio, int uds) {
		super(nombre, precio);
		this.uds = uds;
	}
	
}
