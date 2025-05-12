package agenda;

import java.util.ArrayList;

public class Agenda {
	
	public ArrayList<Contacto> agregarContacto(ArrayList<Contacto>contactos,Contacto contactoNuevo){
		contactos.add(contactoNuevo);
		return contactos;
	}
	
	
	public ArrayList<Contacto> eliminarContacto(ArrayList<Contacto>contactos,int indice){
		contactos.remove(indice);
		return contactos;
	}
	
	
	
//	public ArrayList<Contacto> modificarContacto(ArrayList<Contacto>contactos,int indice){
//		Contacto modificado = new Contacto;
//		contactos()= modificado;
//		return contactos;
//	}
	
	
	void listarContacto(ArrayList<Contacto>contactos){
		System.out.println(contactos);
	}
}
