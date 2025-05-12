 package openJai;

import java.util.ArrayList;

public class ProyectoContratado extends Proyecto {
	private String empresaContratada;
	private double importeProyecto;
	
	
	public ProyectoContratado(String nombre, int horasEstimadas, double coste, Gestor gestorProyecto,
			ArrayList<Desarrollador> desarrolladores, String empresaContratada, double importeProyecto) {
		super(nombre, horasEstimadas, coste, gestorProyecto,desarrolladores);
		this.empresaContratada = empresaContratada;
		this.importeProyecto = importeProyecto;
	}

	@Override
    public void financiar(double cantidad) {
        this.importeProyecto -= cantidad * 0.1;
    }
	
	@Override
	public String toString() {
		return "ProyectoContratado [empresaContratada=" + empresaContratada + ", importeProyecto=" + importeProyecto
				+ "]";
	}
}
