package zoo;

class Mamifero extends Animal{
	int numCrias;
	
	public Mamifero(String nombre, String especie, int edad, float peso, float longitud, int nc) {
		super(nombre, especie, edad, peso, longitud);
		this.numCrias = nc;
	}

	@Override
	public String toString() {
		return "Mamifero [numCrias=" + numCrias + "]";
	}
}
