package POO;

public class LanzallamasApp {

	public static void main(String[] args) {
		Lanzallamas p1 = new Lanzallamas("Paul", "Lila");
		Lanzallamas p2 = new Lanzallamas("Zaba", "Marron");

		System.out.println(p2);
		p1.setColor("Verde");
		System.out.println(p1); 
	}
}
