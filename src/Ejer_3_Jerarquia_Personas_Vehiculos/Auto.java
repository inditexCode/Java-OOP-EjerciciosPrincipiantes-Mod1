package Ejer_3_Jerarquia_Personas_Vehiculos;

public class Auto extends Vehiculo {

	int numeroPuertas;

	public Auto() {
		super();
	}

	public Auto(String marca, String modelo, int numeroPuertas) {
		super(marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
		return super.mostrarInfo() + " con " + numeroPuertas + " Puertas";
	}
	
	
}
