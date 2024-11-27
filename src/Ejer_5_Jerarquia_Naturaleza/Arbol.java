package Ejer_5_Jerarquia_Naturaleza;

public class Arbol extends Plantas{

	
	public Arbol() {
		super();
	}

	public Arbol(int cantidadTallos, String nombre, String caracteristicas, int edad) {
		super(cantidadTallos, nombre, caracteristicas, edad);
	}

	
	
	@Override
	public String mostrarInfo() {
	    if (edad > 50) {
	        return "Árbol: " + nombre + "\n" +
	               "Es un árbol muy antiguo.\n" +
	               "Cantidad de tallos: " + cantidadTallos + "\n" +
	               "Características: " + caracteristicas + "\n" +
	               "Edad: " + edad + " años\n";
	    } else {
	        return "Árbol: " + nombre + "\n" +
	               "Edad insuficiente para considerarse antiguo.\n" +
	               "Cantidad de tallos: " + cantidadTallos + "\n" +
	               "Características: " + caracteristicas + "\n" +
	               "Edad: " + edad + " años\n";
	    }
	}

    
	
	
	
	
	
}
