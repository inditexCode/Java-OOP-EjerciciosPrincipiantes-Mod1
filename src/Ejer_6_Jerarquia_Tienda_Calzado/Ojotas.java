package Ejer_6_Jerarquia_Tienda_Calzado;

public class Ojotas extends Calzados{

	protected String verano;
	
	

	public Ojotas() {
		super();
	}

	public Ojotas(int idVendedor, String nombre, String seccion, int cantidadVendida, double comision, String verano) {
		super(idVendedor, nombre, seccion, cantidadVendida, comision);
		this.verano = verano;
	}

	public String getVerano() {
		return verano;
	}

	public void setVerano(String verano) {
		this.verano = verano;
	}

	   @Override
	    public double comisiones(double comisionBase) {
	        return super.comisiones(comisionBase) + 5; // Ejemplo: bonus para ojotas
	    }

	   @Override
	    public String mostrarInfo() {
	        return super.mostrarInfo() + ", Temporada: " + verano;
	    }
	
	
	
}
