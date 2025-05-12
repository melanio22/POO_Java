package enums;

public class IntroEnums {

	public static void main(String[] args) {
		
		enum prioridad{
			BAJA(1,"Tarea de poca importancia"),
			MEDIA(2, "Tarea importante"),
			ALTA(3, "Tarea urgente");

			prioridad(int i, String string) {
				// TODO Auto-generated constructor stub
			}		
		}
	}
}
