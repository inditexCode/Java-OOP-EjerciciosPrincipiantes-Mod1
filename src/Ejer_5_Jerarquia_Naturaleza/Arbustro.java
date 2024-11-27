package Ejer_5_Jerarquia_Naturaleza;

public class Arbustro extends Plantas{

	public Arbustro() {
		super();
	}

	public Arbustro(int cantidadTallos, String nombre, String caracteristicas, int edad) {
		super(cantidadTallos, nombre, caracteristicas, edad);
	}

	@Override
	public String mostrarInfo() {
	    return "Arbustro: " + nombre + "\n" +
	           "Cantidad de tallos: " + cantidadTallos + "\n" +
	           "Características: " + caracteristicas + "\n" +
	           "Edad: " + edad + " años\n";
	}

     	
	
}
