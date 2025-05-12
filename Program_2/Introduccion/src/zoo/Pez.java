package zoo;

public class Pez extends Animal {
	float vnado;
	String tipoAgua;
	
	public Pez(String nombre, String especie, int edad, float peso, float longitud,float vnado, String tipoAgua) {
		super(nombre, especie, edad, peso, longitud);
		this.tipoAgua=tipoAgua;
		this.vnado = vnado;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + getNombre() + ", especie=" + getEspecie() + ", edad=" + getEdad() + ", peso=" + getPeso() + ", longitud="
				+ getLongitud() + "Pez [vnado=" + vnado + ", tipoAgua=" + tipoAgua + "]";
	}
	
}
