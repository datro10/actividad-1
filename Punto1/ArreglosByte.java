/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Punto1;

/**
 *
 * @author cerda
 */
public class ArreglosByte {
    /**
     * Punto de entrada para la ejecución del programa.
     */
    public static void main(String[] args) {

        // Declaración e inicialización del arreglo de tipo byte con un tamaño de 5 elementos
        byte arregloByte[] = new byte[5];

        // Asignación de valores a cada elemento del arreglo
        arregloByte[0] = 1;
        arregloByte[1] = 2;
        arregloByte[2] = 3;
        arregloByte[3] = 4;
        arregloByte[4] = 5;

        // Iteración a través de los elementos del arreglo e impresión de cada uno
        for (byte i = 0; i < 5; i++) {
            System.out.println(arregloByte[i]);
        }
    }
}