package Ejer_3_Jerarquia_Personas_Vehiculos;

/*
 * 3 - Crear una jerarquía de personas y vehículos Objetivo: Crear una jerarquía
 * de clases para modelar personas y vehículos. En este ejercicio, algunas
 * clases tendrán parámetros, y utilizaremos constructores, herencia, y
 * polimorfismo.
 * 
 * 
 * instrucciones: Crea una clase base llamada Persona con los siguientes
 * atributos: nombre (String) apellido (String) Un constructor para inicializar
 * estos atributos. Un método presentarse() que imprima el nombre completo de la
 * persona. Crea una clase derivada llamada Conductor que herede de Persona y
 * agregue el atributo: vehiculo (de tipo Vehiculo), que indica el vehículo que
 * conduce. Un constructor para inicializar todos los atributos, incluyendo el
 * vehículo. Un método manejar() que imprima
 * "El conductor [nombre] está conduciendo [vehículo]". Crea una clase base
 * llamada Vehiculo con los siguientes atributos: marca (String) modelo (String)
 * Un constructor para inicializar estos atributos. Un método mostrarInfo() que
 * imprima la información del vehículo. Crea dos clases derivadas de Vehiculo:
 * Coche que tenga un atributo adicional numeroDePuertas (int), con un
 * constructor para inicializar todo y un método mostrarInfo(), que imprima la
 * información completa del coche. Bicicleta que tenga un atributo adicional
 * numeroDeRuedas (int), con un constructor para inicializar todo y un método
 * mostrarInfo(), que imprima la información completa de la bicicleta. Luego, en
 * la clase Test, crea instancias de Conductor, Coche, y Bicicleta y usa los
 * métodos correspondientes para demostrar el uso de polimorfismo y parámetros
 * en las clases.
 * 
 * -----------------------------------------------------------------------------
 * -----------
 * 
 */
