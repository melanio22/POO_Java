package openJai;

import java.util.Date;

public class Gestor extends Empleado{
	private String tipoProyecto;

	
	
	public Gestor(String nombre, Date fechaIncorporacion, String tipoProyecto) {
		super(nombre, fechaIncorporacion);
		this.tipoProyecto = tipoProyecto;
	}

	@Override
	public String toString() {
		return "Gestor [tipoProyecto=" + tipoProyecto + "]";
	}
}
