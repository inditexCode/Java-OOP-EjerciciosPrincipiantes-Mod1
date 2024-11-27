package Ejer_6_Jerarquia_Tienda_Calzado;

public class Zapatillas extends Calzados{

	protected String running;

	public Zapatillas() {
		super();
	}

	public Zapatillas(int idVendedor, String nombre, String seccion, int cantidadVendida, double comision,
			String running) {
		super(idVendedor, nombre, seccion, cantidadVendida, comision);
		this.running = running;
	}

	public String getRunning() {
		return running;
	}

	public void setRunning(String running) {
		this.running = running;
	}

	@Override
	public double comisiones(double comisiones) {
           double ventas = 55;
		return ventas;
	}

	@Override
	public String mostrarInfo() {
		// TODO Auto-generated method stub
		return "ID: " + idVendedor + " - Calzado de: " + running + " - Nombre: " + nombre + " - Sección: " + seccion
				+ " - Cantidad Venta: " + cantidadVendida + " - Comisión: " + comision + " %";
	}
	
	
	
}
