package Ejer_6_Jerarquia_Tienda_Calzado;

public class Calzados {
	
	protected  int idVendedor;
	protected  String nombre;
	protected  String seccion;
	protected  int cantidadVendida;
	protected  double comision;
	
	

	public Calzados() {
		super();
	}

	public Calzados(int idVendedor, String nombre, String seccion, 
			        int cantidadVendida, double comision) {
		super();
		this.idVendedor = idVendedor;
		this.nombre = nombre;
		this.seccion = seccion;
		this.cantidadVendida = cantidadVendida;
		this.comision = comision;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	public double comisiones(double comisionesBase) {
	
		if(cantidadVendida > 50) {
       return cantidadVendida * comisionesBase;
		}
		
		return 0;
	}
	
	public String mostrarInfo() {
		
		return "ID: " + idVendedor +
			   " -  Nombre: " + nombre +
			   " -  Sección: " + seccion +
			   " -  Cantidad Venta: " + cantidadVendida +
			   " -  Comisión: " + comision + " %";
	}

	@Override
	public String toString() {
		return "Calzados [idVendedor=" + idVendedor + ", nombre=" + nombre + ", seccion=" + seccion
				+ ", cantidadVendida=" + cantidadVendida + ", comision=" + comision + " %" + "]";
	}
	
	
	



	

}
