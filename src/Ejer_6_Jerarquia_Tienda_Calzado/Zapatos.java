package Ejer_6_Jerarquia_Tienda_Calzado;

public class Zapatos extends Calzados {

	protected String invierno;

	public Zapatos() {
		super();
	}

	public Zapatos(int idVendedor, String nombre, String seccion, int cantidadVendida, double comision,
			String invierno) {
		super(idVendedor, nombre, seccion, cantidadVendida, comision);
		this.invierno = invierno;
	}

	public String getInvierno() {
		return invierno;
	}

	public void setInvierno(String invierno) {
		this.invierno = invierno;
	}

	@Override
	public double comisiones(double comisiones) {
		return cantidadVendida * comisiones;
	}

	@Override
	public String mostrarInfo() {
	    return super.mostrarInfo() + ", Tipo: " + invierno;
	}


}
