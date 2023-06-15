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
 * Clase que muestra un ejemplo de un arreglo de tipo Short en Java.
 */
public class ArregloShort2 {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo Short con un tamaño de 5 elementos
        Short[] arregloShort = new Short[5];

        // Asignación de valores a cada elemento del arreglo
        arregloShort[0] = 1;
        arregloShort[1] = 2;
        arregloShort[2] = 3;
        arregloShort[3] = 4;
        arregloShort[4] = 5;

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (int i = 0; i < arregloShort.length; i++) {
            System.out.println(arregloShort[i]);
        }
    }
}