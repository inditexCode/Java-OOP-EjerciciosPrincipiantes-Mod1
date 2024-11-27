package Ejer_4_Jerarquia_Empleados_Dispositivos;

public class Empleado {

	protected String nombre;
	protected String cargo;
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String cargo) {
		super();
		this.nombre = nombre;
		this.cargo = cargo;
	}
	
	public void trabajar() {
  
System.out.println("🧑‍💻 El empleado " + nombre + ", que trabaja como " 
                       + cargo + ", está realizando sus tareas.");

	}
	
	
}
