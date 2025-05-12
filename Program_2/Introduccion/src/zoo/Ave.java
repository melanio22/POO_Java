package zoo;

public class Ave extends Animal{
	String colorHuevos;
	float tamHuevos;
	
	public Ave(String nombre, String especie, int edad, float peso, float longitud,String cH,float tam) {
		super(nombre, especie, edad, peso, longitud);
		this.colorHuevos = cH;
		this.tamHuevos = tam;
	}

	@Override
	public String toString() {
		return "Ave [colorHuevos=" + colorHuevos + ", tamHuevos=" + tamHuevos + "]";
	}
	
}
