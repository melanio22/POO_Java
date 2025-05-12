package restaurante;

public class Postre extends Plato{
	int gramos;

	public Postre(String nombre, float precio, int gramos) {
		super(nombre, precio);
		this.gramos = gramos;
	}
}
