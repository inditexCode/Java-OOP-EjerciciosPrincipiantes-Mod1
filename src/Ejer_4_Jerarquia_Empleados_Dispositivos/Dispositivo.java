package Ejer_4_Jerarquia_Empleados_Dispositivos;

public class Dispositivo {

	protected String marca;
	protected String modelo;
	
	public Dispositivo() {
		super();
	}

	public Dispositivo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String mostrarInfo() {
		
		return "Marca " + marca + " Modelo " + modelo ;
	}
	
}
