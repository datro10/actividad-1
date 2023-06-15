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
 * Clase que muestra un ejemplo de un arreglo de tipo Object en Java.
 */
public class ArregloObject {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo Object con un tamaño de 5 elementos
        Object[] arreglo = new Object[5];

        // Asignación de valores a cada elemento del arreglo
        arreglo[0] = 12;
        arreglo[1] = "Cadena";
        arreglo[2] = 78.3;
        arreglo[3] = 1;
        arreglo[4] = 567.9676f;

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
