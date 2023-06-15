/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author cerda
 */
/**
 * Clase que muestra un ejemplo de un arreglo de tipo long en Java.
 */
public class ArregloLong {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo long con un tamaño de 5 elementos
        long arregloLong[] = new long[5];

        // Asignación de valores a cada elemento del arreglo
        arregloLong[0] = 16237485;
        arregloLong[1] = 77145696;
        arregloLong[2] = 1648495759;
        arregloLong[3] = 1836945056;
        arregloLong[4] = 216485932;

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (long dimension : arregloLong) {
            System.out.println(dimension);
        }
    }
}