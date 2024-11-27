package Ejer_5_Jerarquia_Naturaleza;

public class Test {

	public static void main(String[] args) {

		Plantas planta = new Plantas(5, "Planta Genérica", "Es una planta común", 3);
		Arbol arbol = new Arbol(0, "Roble", "Muy robusto", 60);
		Arbol arbol1 = new Arbol(0, "Eucalipto", "Robusto", 30);
		Arbustro arbu = new Arbustro(8, "Hortensia", "Florece en primavera", 2);
		Frutales frutas = new Frutales(10, "Manzano", "Produce manzanas deliciosas", 4, "Manzanas");
		
		
		
		System.out.println(planta.mostrarInfo());
		System.out.println(arbol.mostrarInfo());
		System.out.println(arbol1.mostrarInfo());
		System.out.println(arbu.mostrarInfo());
		System.out.println(frutas.mostrarInfo());
	 
	}

}
