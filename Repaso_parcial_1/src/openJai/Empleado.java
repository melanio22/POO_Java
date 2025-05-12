package openJai;

import java.util.Date;

public class Empleado {
	private static int id;
	private int contadorId = 1;
	private Date fechaIncorporacion;
	private String nombre;
	
	public Empleado(String nombre, Date fechaIncorporacion) {
		super();
		this.nombre = nombre;
		this.id = contadorId++;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public static Date getFechaIncorporacion(Date fechaIncorporacion) {
		return fechaIncorporacion;
	}

	@Override
	public String toString() {
		return "Empleado [contadorId=" + contadorId + ", fechaIncorporacion=" + fechaIncorporacion + "]";
	}
}
