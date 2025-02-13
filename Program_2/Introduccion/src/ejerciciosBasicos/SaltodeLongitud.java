package ejerciciosBasicos;
import java.lang.Math;

public class SaltodeLongitud {

	public static void main(String[] args) {
		double gravedad = 1.633;
		double velocidad = 4;
		double angulo = 45;
		
		angulo = angulo*2;
		double seno = Math.sin(angulo);
		
		double distancia = ((Math.pow(velocidad, 2))*(seno))/gravedad;
		
		System.out.println(distancia);
		
		
	}

}
