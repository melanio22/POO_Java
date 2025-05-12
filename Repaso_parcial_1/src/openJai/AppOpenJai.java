package openJai;

public class AppOpenJai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	GestionOpenJai gestion = new GestionOpenJai();
        gestion.ordenarEmpleados();
        System.out.println("Coste total tras financiamiento: " + gestion.contabilidad());
	}
}
