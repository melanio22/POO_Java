package restaurante;

import java.time.LocalDate;

public class AppRestaurante {

	public static void main(String[] args) {
		Pedido p1 = new Pedido("2025-03-26","Encargado1"); //Hay que poner el formato tal y como lo especifica 
														   //la variable de parse, por eso si viniese en formato 
														   //normal como en españor habría que darle la vuelta al String
		
		Plato macarrones = new Plato("Macarrones con tomate",9);
		
		
		Pedido c1 = new Comedor("2025-03-26","Encargado2");
	}

}
