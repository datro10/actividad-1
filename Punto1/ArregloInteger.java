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
 * Clase que muestra un ejemplo de un arreglo de tipo Integer en Java.
 */
public class ArregloInteger {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo Integer con un tamaño de 5 elementos
        Integer[] arregloInteger = new Integer[5];

        // Asignación de valores a cada elemento del arreglo
        arregloInteger[0] = 100;
        arregloInteger[1] = 200;
        arregloInteger[2] = 300;
        arregloInteger[3] = 400;
        arregloInteger[4] = 1000;

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (int i = 0; i < arregloInteger.length; i++) {
            System.out.println(arregloInteger[i]);
        }
    }
}
