package Ejer_3_Jerarquia_Personas_Vehiculos;

public class Vehiculo {
	
	protected String marca;
	protected String modelo;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String mostrarInfo() {
		return marca + " " + modelo;
	}
	

}
