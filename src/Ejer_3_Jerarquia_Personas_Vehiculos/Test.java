package Ejer_3_Jerarquia_Personas_Vehiculos;

public class Test {

	public static void main(String[] args) {

		
		
		Persona persona1 = new Persona("Juan","Perez");
		Conductor con1 = new Conductor("Agustina","Smithd", new Auto("Toyota", "Corolla",4));
		Conductor con2 = new Conductor("Ana","Martinez", new Bicicleta("Giant", "Bike",2));

		
		persona1.presentarse();
		
		con1.manejar();
		con2.manejar();
	}

}
