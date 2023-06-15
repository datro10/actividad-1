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
 * Clase que muestra un ejemplo de un arreglo de tipo double en Java.
 */
public class ArregloDouble {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo double con un tamaño de 5 elementos
        double arregloDouble[] = {1.3, 2.3, 4.5, 8.8, 9.7};

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (double dimension : arregloDouble) {
            System.out.println(dimension);
        }
    }
}