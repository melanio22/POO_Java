package POO;

public class LigaApp {

	public static void main(String[] args) {
	      // Crear entrenadores
        Entrenador entrenador1 = new Entrenador("Carlos");
        Entrenador entrenador2 = new Entrenador("Luis");

        // Crear jugadores
        Jugador portero1 = new Portero("Alaves","Pedro","123");
        Jugador defensa1 = new Defensa("Sevilla","Juan","234");
        Jugador centro1 = new Centro("Alaves","Luis","345");
        Jugador delantero1 = new Delantero("Sevilla","Andrés","456");
        
        //Crear arbitros
        Arbitro arbitro1 = new Arbitro("Jesus");
        //Crear equipo compuesto por jugadores
        Equipo equipo1 = new Equipo("Alaves",entrenador1,portero1,defensa1,centro1,delantero1);
        Equipo equipo2 = new Equipo("Sevilla",entrenador1,portero1,defensa1,centro1,delantero1);

        
        System.out.println(equipo1);
        entrenador1.fichar(equipo1,equipo2);
        
       
	}
	
}
