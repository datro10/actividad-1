/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author cerda
 */
public class arreglosChar {
    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Palabra de la cual se va a crear el arreglo de tipo char
        String palabra = "cinco";

        // Declaración e inicialización del arreglo de tipo char con un tamaño de 5 elementos
        char array[] = new char[5];

        // Asignación de caracteres del String al arreglo de tipo char
        array[0] = palabra.charAt(0);
        array[1] = palabra.charAt(1);
        array[2] = palabra.charAt(2);
        array[3] = palabra.charAt(3);
        array[4] = palabra.charAt(4);

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
