package Ejer_4_Jerarquia_Empleados_Dispositivos;

/* 4 - 
 * Crear una jerarquía de clases para empleados y dispositivos Objetivo: Crear
 * una jerarquía de clases para modelar empleados y dispositivos que utilizan en
 * su trabajo. Este ejercicio incluye el uso de constructores, herencia y
 * polimorfismo.
 * 
 * Instrucciones: Crea una clase base llamada Empleado con los siguientes
 * atributos:
 * 
 * nombre (String) cargo (String) Un constructor para inicializar estos
 * atributos. Un método trabajar() que imprima: "El empleado [nombre], que
 * trabaja como [cargo], está realizando sus tareas." Crea una clase derivada
 * llamada Tecnico que herede de Empleado y agregue:
 * 
 * dispositivo (de tipo Dispositivo), que indica el equipo que utiliza. Un
 * constructor para inicializar todos los atributos, incluyendo el dispositivo.
 * Un método reparar() que imprima: "El técnico [nombre] está reparando el
 * dispositivo [dispositivo]." Crea una clase base llamada Dispositivo con los
 * siguientes atributos:
 * 
 * marca (String) modelo (String) Un constructor para inicializar estos
 * atributos. Un método mostrarInfo() que imprima la información del
 * dispositivo. Crea dos clases derivadas de Dispositivo:
 * 
 * Ordenador con un atributo adicional: tipoProcesador (String), y un
 * constructor para inicializar todo. Un método mostrarInfo() que imprima:
 * "Ordenador: [marca] [modelo], Procesador: [tipoProcesador]." Telefono con un
 * atributo adicional: numeroDeLineas (int), y un constructor para inicializar
 * todo. Un método mostrarInfo() que imprima: "Teléfono: [marca] [modelo],
 * Líneas soportadas: [numeroDeLineas]." Crea una clase Test para demostrar:
 * 
 * La creación de instancias de Tecnico, Ordenador, y Telefono. El uso de
 * herencia, constructores y polimorfismo llamando a los métodos trabajar(),
 * reparar() y mostrarInfo().
 * 
 * ---------------------------------------------------------------------------------------
 * 
 * 
 */
