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
 * Clase que muestra un ejemplo de un arreglo de tipo Character en Java.
 */
public class ArregloCharacter {

    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo Character con un tamaño de 5 elementos
        Character[] arregloCharacter = new Character[5];

        // Asignación de valores a cada elemento del arreglo
        arregloCharacter[0] = 'H';
        arregloCharacter[1] = 'e';
        arregloCharacter[2] = 'l';
        arregloCharacter[3] = 'l';
        arregloCharacter[4] = 'o';

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (int i = 0; i < arregloCharacter.length; i++) {
            System.out.println(arregloCharacter[i]);
        }
    }
}
