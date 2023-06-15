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
 * Clase que muestra un ejemplo de un arreglo de tipo float en Java.
 */
public class ArregloFloat {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo float con un tamaño de 5 elementos
        float arregloFloat[] = {8.989f, 89.23f, 83.49f, 4.589f, 6.589f};

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (float dimension : arregloFloat) {
            System.out.println(dimension);
        }
    }
}
