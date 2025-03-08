/*The Boring Company ha sacado al mercado
una edición limitada de lanzallamas en la que
cada ejemplar tendrá un número de serie
diferente. Programa una clase para gestionar
los lanzallamas (usuario, color, nserie)
empleando una propiedad de clase para que
los números de serie no coincidan.*/

package POO;

class Lanzallamas {
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
	public void setNserie(int nserie) {
		this.nserie = nserie;
	}

	public Lanzallamas(String usuario, String color) {
		super();
		this.usuario = usuario;
		this.color = color;
		nserie = nserie + 1;
	}
	private String usuario;
	private String color;
	private static int nserie; //Esta variable es static porque no queremos que se modifique a lo largo del programa
	@Override
	public String toString() {
		return "Lanzallamas [usuario=" + usuario + ", color=" + color + ", nserie=" + nserie + "]";
	}
	
}