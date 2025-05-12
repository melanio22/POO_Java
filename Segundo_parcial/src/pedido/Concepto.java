package pedido;

import java.util.ArrayList;
import java.util.Iterator;

public class Concepto{

	int codigoProducto;
	String nombrePedido;
	int cantidadProducto;
	
	public Concepto(int codigoProducto, String nombrePedido, int cantidadProducto) {
		this.codigoProducto = codigoProducto;
		this.nombrePedido = nombrePedido;
		this.cantidadProducto = cantidadProducto;
	}

	@Override
	public String toString() {
		return "Concepto [codigoProducto=" + codigoProducto + ", nombrePedido=" + nombrePedido + ", cantidadProducto="
				+ cantidadProducto + "]";
	}
	public static double getTotal(ArrayList<Concepto> conceptos) { //Preguntar por qué este método tiene que ser static
		double total = 0;
		for (Concepto c : conceptos) {
		    total += c.cantidadProducto;  
		}
		return total;
	}
	
	public static double getTotalIVA(ArrayList<Concepto> conceptos,int IVA) { //Preguntar por qué este método tiene que ser static
		double total = 0;
		for (Concepto c : conceptos) {
			total += c.cantidadProducto;  
		}
		total = total - total*IVA/100;
		return total;
	}
}