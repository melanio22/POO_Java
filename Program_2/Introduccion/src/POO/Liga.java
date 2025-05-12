/*Define y programa la jerarquía de clases necesaria para
hacer un juego de deportes en el que se jueguen partidos
de una liga entre equipos que tienen jugadores de
diferentes demarcaciones (portero, defensa,
centrocampista, delantero) y entrenadores. Todos los
jugadores deberían tener un identificativo único en el
juego y ser convocables (se pueden convocar y
desconvocar). A los partidos también se convocará a un
trío de árbitros. Además, tanto jugadores como
entrenadores son fichables (se pueden comprar y vender).
● Crea un par de equipos con varios jugadores y
entrenadores, tres árbitros y organiza una liga con dos
partidos entre ambos equipos .*/
package POO;

import java.util.Arrays;

public class Liga {
	
}




class Equipo{
	String nombre;
	Entrenador entrenador;
	Jugador[] jugadores;
	
	public Equipo(String nombre, Entrenador entrenador, Jugador...jugadores) {
		super();
		this.nombre = nombre;
		this.entrenador = entrenador;
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", entrenador=" + entrenador + ", jugadores=" + Arrays.toString(jugadores)
				+ "]";
	}
}




class Jugador{
	protected String nombre;
	protected String equipo;
	protected String id;
	public Jugador(String equipo, String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
		this.equipo = equipo;
	}
	

		void fichar(Equipo e1,Equipo e2) {
		System.out.println("El entrenador "+this.nombre + " ha fichado por el equipo "+ e2.nombre + " desde el equipo "+e1.nombre);
//		this.equipo = e2;
		}
//arreglar esto
		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", equipo=" + equipo + ", id=" + id + "]";
		}
		
}




class Arbitro{
	String nombre;

	public Arbitro(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Arbitro [nombre=" + nombre + "]";
	}
}




class Entrenador{
	String nombre;
	Equipo equipo;
	public Entrenador(String nombre) {
		this.nombre = nombre;
	}
	void fichar(Equipo e1,Equipo e2) {
		System.out.println("El entrenador "+this.nombre + " ha fichado por el equipo "+ e2.nombre + " desde el equipo "+e1.nombre);
		this.equipo = e2;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + "]";
	}
}



	
class Portero extends Jugador{
	
	public Portero(String equipo,String nombre, String id){
		super(equipo,nombre,id);
		
	}
	@Override
	public String toString() {
		return "Jugador [id=" + id + "Portero []";
	}
}




class Defensa extends Jugador{

	
	public Defensa(String equipo, String nombre, String id) {
		super(equipo, nombre, id);
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + "Defensa []";
	}
}




class Centro extends Jugador{

	public Centro(String equipo, String nombre, String id) {
		super(equipo, nombre, id);
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + "Centro []";
	}
}




class Delantero extends Jugador{
	
	public Delantero(String equipo, String nombre, String id) {
		super(equipo, nombre, id);
	}

	@Override
	public String toString() {
		return "Jugador [id= " + id + "Delantero]";
	}
}




interface fichable {
	void fichar (Equipo origen, Equipo destino);
	void vender (Equipo origen, Equipo destino);
}


interface convocable{
	void convocar(Jugador jugador1);
	
	//añadir las interfaces a cada clase y hacer que añadan y eliminen jugadores de cada equipo
}