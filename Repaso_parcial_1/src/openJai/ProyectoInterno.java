package openJai;

import java.util.ArrayList;

public class ProyectoInterno extends Proyecto{
	private String departamento;
	

	
	public ProyectoInterno(String nombre, int horasEstimadas, double coste, Gestor gestorProyecto,
			ArrayList<Desarrollador> desarrolladores, String departamento) {
		
		super(nombre, horasEstimadas, coste, gestorProyecto, desarrolladores);
		this.departamento = departamento;
	}
	
	 @Override
	    public void financiar(double cantidad) {
	        this.setCoste(this.getCoste() - cantidad * 0.3);
	    }

	 
	@Override
	public String toString() {
		return "ProyectoInterno [departamento=" + departamento + "]";
	}
}
