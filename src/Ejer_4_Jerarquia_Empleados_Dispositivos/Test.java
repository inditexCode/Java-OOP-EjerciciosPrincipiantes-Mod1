package Ejer_4_Jerarquia_Empleados_Dispositivos;

public class Test {

	public static void main(String[] args) {

		Ordenador ordenador = new Ordenador("Dell", "XPS 13", "Intel i7");
        Telefono telefono = new Telefono("Samsung", "Galaxy S21", 2);

        
     // Crear técnico
        Tecnico tecnico = new Tecnico("Juan", "Soporte Técnico", ordenador);

        tecnico.trabajar();
        tecnico.reparar();
        
        System.out.println();
        // Cambiar el dispositivo que el técnico está reparando
        tecnico.dispositivo = telefono;
        tecnico.reparar();
        
	}

}
