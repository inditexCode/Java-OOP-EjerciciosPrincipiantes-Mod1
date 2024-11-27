package Ejer_5_Jerarquia_Naturaleza;

public class Plantas {

	
	protected int cantidadTallos;
	protected String nombre;
	protected String caracteristicas;
	protected int edad;
	
	public Plantas() {
		super();
	}

	public Plantas(int cantidadTallos, String nombre, String caracteristicas, int edad) {
		super();
		this.cantidadTallos = cantidadTallos;
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.edad = edad;
	}

	public int getCantidadTallos() {
		return cantidadTallos;
	}

	public void setCantidadTallos(int cantidadTallos) {
		this.cantidadTallos = cantidadTallos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String mostrarInfo() {
	    return "Planta: " + nombre + "\n" +
	           "Cantidad de tallos: " + cantidadTallos + "\n" +
	           "Características: " + caracteristicas + "\n" +
	           "Edad: " + edad + " años\n";
	}

	@Override
	public String toString() {
		return "Plantas [cantidadTallos=" + cantidadTallos + ", nombre=" + nombre + ", caracteristicas="
				+ caracteristicas + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
}
