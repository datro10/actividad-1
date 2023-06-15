/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2al4;

import java.util.Arrays;

/**
 *
 * @author cerda
 */
public class ClasePrincipal {
 public static void main(String[] args) {
        Ventas ventas1 = new Ventas();

        // Imprime el mensaje que indica el número de venta actual
        System.out.println(ventas1.getterVenta());

        // Imprime el arreglo de ventas
        System.out.println(Arrays.toString(ventas1.getterVentas()));

        // Imprime el promedio de ventas
        System.out.println(ventas1.getterPromedio());

        // Imprime la venta mayor
        System.out.println(ventas1.getterVentamayor());

        // Imprime la venta menor
        System.out.println(ventas1.getterVentaMenor());

        // Imprime el arreglo de ventas en orden descendente
        System.out.println(Arrays.toString(ventas1.getterDecendentes()));

        // Imprime el arreglo de ventas en orden ascendente
        System.out.println(Arrays.toString(ventas1.getterAcendentes()));

        // Imprime el arreglo desordenado de ventas
        System.out.println(Arrays.toString(ventas1.setterDesorden()));

        // Imprime el arreglo de ventas pares
        System.out.println(Arrays.toString(ventas1.getterPar()));

        // Imprime el arreglo de ventas impares
        System.out.println(Arrays.toString(ventas1.getterImpar()));
    }
}
