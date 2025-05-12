package pedido;

import java.util.ArrayList;

public class Pedido {
	//Propiedades
		String fecha;
		String cliente;
		boolean estaPagado;
		ArrayList<Concepto>conceptos;
	
	public Pedido(ArrayList<Concepto> conceptos, String fecha, String cliente, boolean estaPagado) {
		this.conceptos = new ArrayList();
		this.fecha = fecha;
		this.cliente = cliente;
		this.estaPagado = estaPagado;
	}

	@Override
	public String toString() {
		return "Pedido [fecha=" + fecha + ", cliente=" + cliente + ", estaPagado=" + estaPagado + ", conceptos="
				+ conceptos + "]";
	}
	
}
