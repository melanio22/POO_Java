package restaurante;

public class Vino extends Bebida{
	String tipo;
	int graduacion;
	
	public Vino(String nombre, float precio, float cl, String tipo, int graduacion) {
		super(nombre, precio, cl);
		this.tipo = tipo;
		this.graduacion = graduacion;
	}
	
	
}
