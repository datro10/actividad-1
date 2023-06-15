/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2al4;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author cerda
 */
public class Pruebas {

    public static void main(String[] args) {
        int cantidad = (int) (Math.random() * 10 + 1);
        int ventas[] = new int[cantidad];
        int nventa;
        int sum = 0;
        int promedio = 0;
        int ventamayor;
        int ventaMenor;
        int ventaMasCercana;

        System.out.println("Numero de ventas: " + cantidad);

        for (int i = 0; i < cantidad; i++) {
            int valor = (int) (Math.random() * 1000 + 1);
            ventas[i] = valor;
            nventa = i + 1;

            System.out.println("Venta #" + nventa + ": " + ventas[i]);
        }

        for (int i = 0; i < ventas.length; i++) {
            promedio += ventas[i];
        }

        ventamayor = ventas[0];
        for (int i = 1; i < ventas.length; i++) {

            if (ventas[i] > ventamayor) {

                ventamayor = ventas[i];
            }
        }
        ventaMenor = ventas[0];
        for (int i = 1; i < ventas.length; i++) {

            if (ventas[i] < ventaMenor) {

                ventaMenor = ventas[i];
            }
        }

        Arrays.sort(ventas);
        int[] ventasDecendentes = new int[ventas.length];
        for (int i = 0; i < ventas.length; i++) {
            ventasDecendentes[i] = ventas[ventas.length - 1 - i];

        }
        System.out.println("orden Decendente:");
        System.out.println(Arrays.toString(ventasDecendentes));

        System.out.println("Orden Acendente");
        Arrays.sort(ventas);

        System.out.println(Arrays.toString(ventas));

        System.out.println("desordenado");
        Object[] desorden = new Object[ventas.length];
        for (int i = 0; i < ventas.length; i++) {
            desorden[i] = ventas[i];
        }
        Collections.shuffle(Arrays.asList(desorden));
        System.out.println(Arrays.toString(desorden));

        int nPar = 0, nImpar = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] % 2 == 0) {
                nPar++;
            } else {
                nImpar++;
            }

        }

        int par[] = new int[nPar];
        int impar[] = new int[nImpar];

        nPar = 0;
        nImpar = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] % 2 == 0) {
                par[nPar] = ventas[i];
                nPar++;
            } else {
                impar[nImpar] = ventas[i];
                nImpar++;

            }
        }
        System.out.println("ventas Par ");
        for (int i = 0; i < nPar; i++) {
            System.out.println(par[i] + " ");
        }

        System.out.println("Ventas Impar");
        for (int i = 0; i < nImpar; i++) {
            System.out.println(impar[i] + " ");
        }

        System.out.println("Total de ventas: " + promedio);
        System.out.println("Promedio de ventas: " + promedio / ventas.length);
        System.out.println("la venta mayor es " + ventamayor);
        System.out.println("le venta menor es " + ventaMenor);

    }
}
