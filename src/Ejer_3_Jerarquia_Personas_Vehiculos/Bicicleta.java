package Ejer_3_Jerarquia_Personas_Vehiculos;

public class Bicicleta extends Vehiculo{

	int numeroRuedas;

	public Bicicleta() {
		super();
	}

	public Bicicleta(String marca, String modelo, int numeroRuedas) {
		super(marca, modelo);
		this.numeroRuedas = numeroRuedas;
	}

	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
		return super.mostrarInfo() + " con " + numeroRuedas + " Ruedas";
	}
	
	
	
}
