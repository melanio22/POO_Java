package zoo;

public class Reptil extends Animal{
	boolean esVenenoso;

	public Reptil(String nombre, String especie, int edad, float peso, float longitud,boolean esVen) {
		super(nombre, especie, edad, peso, longitud);
		this.esVenenoso = esVen;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + getNombre() + ", especie=" + getEspecie() + "edad=" + getEdad() + ", peso=" + getPeso() +  
		"longitud= " + getLongitud() +"Reptil [esVenenoso=" + esVenenoso + "]";
	}

}
