package Ejer_3_Jerarquia_Personas_Vehiculos;

public class Persona {
	protected String nombre;
	protected String apellido;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void presentarse() {
		System.out.println("HOLA SOY " + nombre + apellido);
	}

}
