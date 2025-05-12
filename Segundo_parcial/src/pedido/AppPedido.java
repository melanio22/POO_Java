package pedido;

import java.util.ArrayList;
import java.util.Collections; //PARA REPASAR IMPLEMENTAR LA FECHA CON LOCALDATE
import java.util.Comparator;

import comparable.Estudiante2;

public class AppPedido {

	public static void main(String[] args) {
		Concepto c1 = new Concepto(001,"Monitor",155);
		Concepto c2 = new Concepto(002,"Mini PC",500);
		Concepto c3 = new Concepto(003,"Silla",230);
		Concepto c4 = new Concepto(004,"Mesa",99);
		
		ArrayList<Concepto> listaConceptos = new ArrayList();
		listaConceptos.add(c1);
		listaConceptos.add(c2);
		listaConceptos.add(c3);
		listaConceptos.add(c4);
		
		Comparator<Concepto> comparador = new Comparator<Concepto>() {  //Aqui dentro se pueden implmentar mas condiciones 
			@Override
			public int compare(Concepto c1 , Concepto c2) {
				int resultado = c1.cantidadProducto - c2.cantidadProducto;
				return resultado;
			}
		}; 
		
		//ordena el arrayList listaConceptos en base al comparador definido con anterioridad
		Collections.sort(listaConceptos,comparador);
		
		Pedido p1 = new Pedido(listaConceptos,"02/04/2025","Markel Vesga", false);
		System.out.println(p1);
		
		double total = Concepto.getTotal(listaConceptos);
		System.out.println("Total precio: " + total);
		
		//total de dinero con el IVA aplicado
		double totalIVA = Concepto.getTotalIVA(listaConceptos,21);
		System.out.println("Total con IVA: " + totalIVA);
	}

}
