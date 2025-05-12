package restaurante;

import java.time.LocalDate;

public class Pedido implements Cobrable{
	static int contadorCodigo = 1;
	private int codigo;
	private LocalDate fecha;
	private String personal;
	
	
	public Pedido(String fecha, String personal) {
		this.fecha = LocalDate.parse(fecha);
		this.personal = personal;
		this.codigo = contadorCodigo ++;
	}
	
	public int getCodigo() {
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getPersonal() {
        return personal;
    }
    @Override
    public boolean aceptaTarjeta(){
    	return false;
    }
    @Override
    
    public boolean aceptaEfectivo(){
    	return false;
    }
}
