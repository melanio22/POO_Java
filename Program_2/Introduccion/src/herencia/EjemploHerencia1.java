package herencia;

public class EjemploHerencia1 {
	private int numeroPatas;
	
	public EjemploHerencia1(int numeroPatas, String nombreAnimal) {
		super();
		this.numeroPatas = numeroPatas;
		this.nombreAnimal = nombreAnimal;
	}


	public int getNumeroPatas() {
		return numeroPatas;
	}


	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}


	public String getNombreAnimal() {
		return nombreAnimal;
	}


	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	private String nombreAnimal;


}
