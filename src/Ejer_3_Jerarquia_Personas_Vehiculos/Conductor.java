package Ejer_3_Jerarquia_Personas_Vehiculos;

public class Conductor extends Persona{

	Vehiculo vehiculo;

	public Conductor() {
		super();
	}

	public Conductor(String nombre, String apellido, Vehiculo vehiculo) {
		super(nombre, apellido);
		this.vehiculo = vehiculo;
	}
	
	public void manejar() {
		System.out.println(nombre + " esta conduciento -> " + vehiculo.mostrarInfo());
	}
	
}
