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
 * Clase que muestra un ejemplo de un arreglo de tipo int en Java.
 */
public class ArregloInt {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo int con un tamaño de 5 elementos
        int arregloInt[] = new int[5];

        // Asignación de valores a cada elemento del arreglo
        arregloInt[0] = 1;
        arregloInt[1] = 2;
        arregloInt[2] = 3;
        arregloInt[3] = 4;
        arregloInt[4] = 5;

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (int i = 0; i < 5; i++) {
            System.out.println(arregloInt[i]);
        }
    }
}
