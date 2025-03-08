/*The Boring Company ha sacado al mercado
una edición limitada de lanzallamas en la que
cada ejemplar tendrá un número de serie
diferente. Programa una clase para gestionar
los lanzallamas (usuario, color, nserie)
empleando una propiedad de clase para que
los números de serie no coincidan.*/

package POO;

class Lanzallamas {
	//declaracion de los atributos de la clase
		private String usuario;
		private String color;
		private final int nserie; //He cambiado la variable de static a final para que cada instancia nueva tenga un nserie distinto
		private static int contadorSerie = 0;
	
	//constructor
	public Lanzallamas(String usuario, String color) {
		this.usuario = usuario;
		this.color = color;
		contadorSerie++;
		nserie = contadorSerie;
		}
	
	//getters y setters
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNserie() {
		return nserie;
	}

	@Override
	public String toString() {
		return "Lanzallamas [usuario=" + usuario + ", color=" + color + ", nserie=" + nserie + "]";
	}	
}