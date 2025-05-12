package agenda;

import java.util.Objects;

public class Contacto {
	String nombre;
	int telefono;
	String email;
	
	
	public Contacto(String nombre, int telefono, String email) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre) && telefono == other.telefono;
	}
}
