package Ejer_4_Jerarquia_Empleados_Dispositivos;

public class Telefono extends Dispositivo{

	protected int numeroLineas;

	public Telefono() {
		super();
	}

	public Telefono(String marca, String modelo, int numeroLineas) {
		super(marca, modelo);
		this.numeroLineas = numeroLineas;
	}

	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
        return "Teléfono: " + marca +
      " " + modelo + ", Líneas soportadas: " + numeroLineas;
	}
	
	
}
