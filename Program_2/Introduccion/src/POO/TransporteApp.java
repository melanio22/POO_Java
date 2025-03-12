package POO;

import java.util.Iterator;

public class TransporteApp {

	public static void main(String[] args) {
		taxi taxi1 = new taxi(72382,2005,143,"Volskwagen Passat",001);
		autobus autobus1 = new autobus(6789876,2022,315,"Scania",67);
	
		//crear un array flota de tipo trasporte ya que todos los elementos en el fondo van a ser de tipo transporte
		Transporte[] flota = new Transporte[2];
		
		//asignar las diferentes instancias al array de flota una en cada posicion
		flota[0]= taxi1;
		flota[1]=autobus1;
		
		//printear cada posicion del array flota
		for (int i=0;i<flota.length;i++) {
			System.out.println(flota[i]);
		}
		
	}

}

