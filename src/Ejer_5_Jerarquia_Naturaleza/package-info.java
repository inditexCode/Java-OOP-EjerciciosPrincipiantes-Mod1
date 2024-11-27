package Ejer_5_Jerarquia_Naturaleza;

/* 5 - 
 * Jerarquía de Plantas Objetivo: Diseñar una jerarquía de clases que modele
 * diferentes tipos de plantas (genéricas, árboles, arbustos y árboles
 * frutales). Este ejercicio tiene como finalidad practicar el uso de herencia,
 * constructores, encapsulamiento, métodos personalizados y polimorfismo.
 * 
 * Instrucciones:
 * 
 * Clase base Plantas:
 * 
 * Define los atributos: cantidadTallos (int): Número de tallos de la planta.
 * nombre (String): Nombre de la planta. caracteristicas (String): Descripción o
 * propiedades de la planta. edad (int): Edad en años de la planta. Implementa
 * un constructor para inicializar estos atributos. Incluye métodos getters y
 * setters para acceder y modificar los atributos. Crea el método mostrarInfo(),
 * que devuelve una descripción básica de la planta. Clase derivada Arbol:
 * 
 * Especializa la clase Plantas para representar árboles. Personaliza el método
 * mostrarInfo() para mostrar características adicionales si el árbol tiene más
 * de 50 años, indicando que es un árbol antiguo.
 * 
 * Clase derivada Arbustro:
 * 
 * Especializa la clase Plantas para representar arbustos. Personaliza el método
 * mostrarInfo() para mostrar características específicas de un arbusto según su
 * cantidad de tallos (por ejemplo, si tiene más de 8 tallos, se considera un
 * arbusto grande). Clase derivada Frutales:
 * 
 * Especializa la clase Plantas para representar árboles frutales. Agrega el
 * atributo adicional: frutas (String): Tipo de fruta que produce. Personaliza
 * el método mostrarInfo() para indicar el tipo de fruta que produce y otras
 * características de los árboles frutales. Clase TestNaturaleza:
 * 
 * Crea una clase principal donde: Instancies al menos una planta genérica, un
 * árbol, un arbusto y un árbol frutal. Utilices el método mostrarInfo() para
 * mostrar las características de cada planta. Demuestra el uso de polimorfismo
 * al invocar mostrarInfo() en objetos de diferentes tipos.
 * 
 * 
 */
