package Ejer_4_Jerarquia_Empleados_Dispositivos;

public class Ordenador  extends Dispositivo{

	protected String tipoProcesador;

	public Ordenador() {
		super();
	}

	public Ordenador(String marca, String modelo, String tipoProcesador) {
		super(marca, modelo);
		this.tipoProcesador = tipoProcesador;
	}

	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
        return "Ordenador: " + marca + " " + modelo + ", Procesador: " + tipoProcesador;
	}
	
	
	
}
