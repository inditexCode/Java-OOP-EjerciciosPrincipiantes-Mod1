package Ejer_6_Jerarquia_Tienda_Calzado;

/*
 * 6 - Enunciado para el Programa Título: Sistema de Gestión de Ventas en Tienda
 * de Calzado
 * 
 * Descripción del problema:
 * 
 * Una tienda de calzado desea desarrollar un sistema que permita gestionar y
 * registrar las ventas realizadas por sus vendedores en distintas categorías de
 * productos: Ojotas, Zapatillas, y Zapatos. El sistema debe permitir almacenar
 * información relevante sobre cada vendedor y el tipo de calzado que
 * comercializan, así como calcular comisiones basadas en el número de unidades
 * vendidas.
 * 
 * El objetivo principal es proporcionar un informe detallado con los datos de
 * cada vendedor, incluyendo la categoría del calzado que vende, la sección
 * donde opera, y las ventas realizadas. Además, debe mostrarse la comisión
 * asignada según el desempeño.
 * 
 * Requisitos funcionales:
 * 
 * Clases principales:
 * 
 * La clase base Calzados incluirá atributos generales para todos los
 * vendedores, como: idVendedor: Identificación única del vendedor. nombre:
 * Nombre del vendedor. seccion: Sección de la tienda donde realiza las ventas.
 * cantidadVendida: Cantidad de calzado vendido por el vendedor. comision:
 * Porcentaje o monto asignado como comisión. Clases derivadas:
 * 
 * Ojotas: Representa un tipo de calzado para el verano. Zapatillas: Representa
 * un tipo de calzado orientado al running. Zapatos: Representa un tipo de
 * calzado formal o de invierno. Cada clase incluirá atributos específicos y
 * podrá sobreescribir métodos según sus necesidades. Métodos requeridos:
 * 
 * comisiones(double comisionBase): Calcula la comisión de acuerdo a las ventas
 * realizadas. mostrarInfo(): Devuelve una cadena de texto con la información
 * detallada del vendedor y el tipo de calzado que comercializa. Prueba del
 * programa:
 * 
 * En el método main, se debe crear una instancia de cada tipo de calzado
 * (ojotas, zapatillas y zapatos). Se deben establecer valores de prueba para
 * cada instancia. El programa debe mostrar la información completa de cada
 * vendedor, incluyendo los atributos generales y específicos, además de su
 * comisión.
 * 
 * 
 * 
 */
