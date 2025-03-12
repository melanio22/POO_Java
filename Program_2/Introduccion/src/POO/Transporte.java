package POO;

public class Transporte {
	protected int nMatricula;
	protected int anoCompra;
	protected int potencia;
	protected String modelo;
	
	//Constructor
		public Transporte(int nMatricula, int anoCompra, int potencia, String modelo) {
			this.nMatricula = nMatricula;
			this.anoCompra = anoCompra;
			this.potencia = potencia;
			this.modelo = modelo;
		}
	//Getters
		public int getnMatricula() {
			return nMatricula;
		}

		public int getAnoCompra() {
			return anoCompra;
		}

		public int getPotencia() {
			return potencia;
		}

		public String getModelo() {
			return modelo;
		}
		
		//Metodo to string
		@Override
		public String toString() {
			return "Transporte [nMatricula=" + nMatricula + ", anoCompra=" + anoCompra + ", potencia=" + potencia
					+ ", modelo=" + modelo + "]";
		}
}

	class taxi extends Transporte{
		private int nLicencia;
	   //constructor de instancias para taxi, incluye el constructor de transporte
		public taxi(int nMatricula, int anoCompra, int potencia, String modelo, int nLicencia) {
			super(nMatricula, anoCompra, potencia, modelo);
			this.nLicencia = nLicencia;
		}
		
		public int getNlicencia() {
			return nLicencia;
		}
	
		@Override
		public String toString() {
			return "taxi [Número de Licencia= " + nLicencia + ", Matricula= " + nMatricula + ", Año de Compra=" + anoCompra + ", potencia=" + potencia
					+ ", modelo=" + modelo + "]";
		}
	}
	
	class autobus extends Transporte{
		private int nplazas;
	
		public autobus(int nMatricula, int anoCompra, int potencia, String modelo, int nplazas) {
			super(nMatricula, anoCompra, potencia, modelo);
			this.nplazas = nplazas;
		}
		
		public int getNplazas() {
			return nplazas;
		}
	
		@Override
		public String toString() {
			return "autobus [Plazas=" + nplazas+ ", Matricula= " + nMatricula + ", Año de Compra=" + anoCompra + ", potencia=" + potencia
					+ ", modelo=" + modelo + "]";
		}
	}
	class Flota{
		
		
	}