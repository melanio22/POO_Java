package openJai;

import java.util.ArrayList;

abstract class Proyecto implements Financiable{
	private String nombre;
	private int horasEstimadas;
	private double coste;
	private Gestor gestorProyecto;
	private ArrayList<Desarrollador> desarrolladores;
	

	public Proyecto(String nombre, int horasEstimadas, double coste, Gestor gestor, ArrayList<Desarrollador> devs) {
		this.nombre = nombre;
		this.horasEstimadas = horasEstimadas;
		this.setCoste(coste);
		this.gestorProyecto = gestor;
		this.desarrolladores = new ArrayList<>(devs);
	}


	public double getCoste() {
		return coste;
	}
	
	public void setCoste(double coste) {
		this.coste = coste;
	}	
	
	@Override
	public String toString() {
		return nombre + " Coste: " + getCoste() + " Gestor: " + gestorProyecto + " Desarrolladores: " + desarrolladores;
	}
}
