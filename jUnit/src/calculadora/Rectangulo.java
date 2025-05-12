package calculadora;

public class Rectangulo {

	double alto;
	double ancho;
	
	public Rectangulo() {
		this.alto = 1;
		this.ancho = 1;
	}
	
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public double getPerimetro() {
		return alto*2 + ancho*2;
	}
}
