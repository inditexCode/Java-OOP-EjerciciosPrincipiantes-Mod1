package Ejer_6_Jerarquia_Tienda_Calzado;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ojotas ojotas = new Ojotas();
		Zapatillas zapa = new Zapatillas();
		Zapatos zapatos = new Zapatos();
		
		ojotas.setCantidadVendida(58);
		ojotas.setComision(10);
		ojotas.setIdVendedor(1);
		ojotas.setNombre("Juan");
		ojotas.setSeccion("Primavera - Verano");
		ojotas.setVerano("verano");

		System.out.println(ojotas.mostrarInfo());
		System.out.println("----------------------------------------------------------------------------------");
		zapa.setCantidadVendida(25);
		zapa.setComision(5);
		zapa.setIdVendedor(2);
		zapa.setNombre("Julia");
		zapa.setRunning("Running");
		zapa.setSeccion("Maratón");
	
		System.out.println(zapa.mostrarInfo());
		System.out.println("----------------------------------------------------------------------------------");

		zapatos.setCantidadVendida(98);
		zapatos.setComision(15);
		zapatos.setIdVendedor(3);
		zapatos.setNombre("Francesca");
		zapatos.setInvierno("No");
		zapatos.setSeccion("Formal");

		System.out.println(zapatos.mostrarInfo());
	}

}
