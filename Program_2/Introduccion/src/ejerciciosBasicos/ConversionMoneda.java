package ejerciciosBasicos;

public class ConversionMoneda {

	public static void main(String[] args) {
		double coste = 18.78;
		double pagado = 20.0;
		double vueltas = pagado-coste;
		//vueltas = vueltas*100;
		System.out.printf("Se te va a devolver %f", vueltas);
		double cambio = 0;
		
		int[] valoresMonedas = {200,100,50,20,10,5,2,1};
		String[] nombresMonedas = {"2€", "1€","50C","20C","10C","5C","2C","1C"};
		//SIN TERMINAR
		
		for (int i = 0;i<valoresMonedas.length; i++) {
			if ((int)(vueltas/valoresMonedas[i])<valoresMonedas[i]) {
				
			}
		}
	}
}
