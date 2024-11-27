package Ejer_5_Jerarquia_Naturaleza;

public class Frutales extends Plantas{

	protected String frutas;

	public Frutales() {
		super();
	}

	public Frutales(int cantidadTallos, String nombre, String caracteristicas, int edad, String frutas) {
		super(cantidadTallos, nombre, caracteristicas, edad);
		this.frutas = frutas;
	}

	@Override
	public String mostrarInfo() {
	    return "Frutal: " + nombre + "\n" +
	           "Produce: " + frutas + "\n" +
	           "Cantidad de tallos: " + cantidadTallos + "\n" +
	           "Características: " + caracteristicas + "\n" +
	           "Edad: " + edad + " años\n";
	}
	
	
}
