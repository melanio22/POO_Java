package openJai;

import java.util.ArrayList;

public class ProyectoFinanciado extends Proyecto{
	private String entidadFinanciadora;
	private double cantidadFinanciada;
	
	
	public ProyectoFinanciado(String nombre, int horasEstimadas, double coste, Gestor gestorProyecto,
			ArrayList<Desarrollador> desarrolladores, String entidadFinanciadora, double cantidadFinanciada) {
		
		super(nombre, horasEstimadas, coste, gestorProyecto, desarrolladores);
		this.entidadFinanciadora = entidadFinanciadora;
		this.cantidadFinanciada = cantidadFinanciada;
	}
	
  @Override
    public void financiar(double cantidad) {
        // No afecta el coste final
    }
	  
	@Override
	public String toString() {
		return "ProyectoFinanciado [entidadFinanciadora=" + entidadFinanciadora + ", cantidadFinanciada="
				+ cantidadFinanciada + "]";
	}	
}
