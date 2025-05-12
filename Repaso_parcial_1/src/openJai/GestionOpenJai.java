package openJai;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GestionOpenJai {

	private ArrayList<Empleado> empleados;
	private ArrayList<Proyecto> proyectos;
	
	
	public GestionOpenJai(ArrayList<Empleado> empleados, ArrayList<Proyecto> proyectos) throws ParseException {
		this.empleados = empleados;
		this.proyectos = proyectos;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaIncorporacion1 = sdf.parse("16/05/2005");
		Date fechaIncorporacion2 = sdf.parse("03/11/2005");
		Date fechaIncorporacion3 = sdf.parse("03/03/2005");
		Date fechaIncorporacion4 = sdf.parse("21/06/2005");
		
		ArrayList<String> lenguajes1 = new ArrayList<String>();
		ArrayList<String> lenguajes2 = new ArrayList<String>();
		ArrayList<String> lenguajes3 = new ArrayList<String>();
		
		lenguajes1.add("Java");
		lenguajes1.add("Ruby");
		lenguajes2.add("Python");
		lenguajes3.add("C");
		lenguajes3.add("JavaScript");
		
		Empleado d1 =  new Desarrollador("Fernando",fechaIncorporacion1, lenguajes1); 
		Empleado d2 =  new Desarrollador("Clara",fechaIncorporacion2, lenguajes2);
		Empleado d3 =  new Desarrollador("Javier",fechaIncorporacion3, lenguajes3);
		
		Empleado g1 =  new Gestor ("Zaba",fechaIncorporacion4,"Medicina");
		Empleado g2 =  new Gestor ("Pablo",fechaIncorporacion4,"Industria");
		
	}
	public void ordenarDesarrollador(ArrayList<Desarrollador>desarrolladores) {
		desarrolladores.sort(null);
	}

	@Override
	public String toString() {
		return "GestionOpenJai [empleados=" + empleados + ", proyectos=" + proyectos + "]";
	}
}
