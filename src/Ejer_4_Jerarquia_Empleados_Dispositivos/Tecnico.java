package Ejer_4_Jerarquia_Empleados_Dispositivos;

public class Tecnico extends Empleado{

	Dispositivo dispositivo;
	
	public Tecnico() {
		super();
	}
	public Tecnico(String nombre, String cargo, Dispositivo dispositivo) {
		super(nombre, cargo);
		this.dispositivo = dispositivo;
	}

	public void reparar() {
		
	System.out.println("🪛 El técnico " + nombre +" está reparando el dispositivo " + dispositivo.mostrarInfo());
	}
}
