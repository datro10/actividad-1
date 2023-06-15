/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2al4;

import java.util.Arrays;
import java.util.Collections;

/**
 * Clase que representa un registro de ventas.
 */
public class Ventas {

    // Variables miembro
    private int posiccionarray;
    private int cantidad;
    private int nventa;
    private int promedio;
    private int valor;
    private int ventamayor;
    private int ventaMenor;
    int ventas[];
    int[] ventasDecendentes;
    Object[] desorden;
    int[] par;
    int[] impar;

    /**
     * Constructor de la clase Ventas. Genera y procesa los datos de ventas.
     */
    public Ventas() {

        // Inicialización de variables
        promedio = 0;
        nventa = 0;
        cantidad = (int) (Math.random() * 10 + 1);
        posiccionarray = 0;

        // Generación de valores de ventas aleatorios
        ventas = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            valor = (int) (Math.random() * 1000 + 1);
            ventas[i] = valor;
            nventa = i + 1;
        }

        // Cálculo del promedio de ventas
        for (int i = 0; i < ventas.length; i++) {
            promedio += ventas[i];
        }

        // Cálculo de la venta mayor
        ventamayor = ventas[0];
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventamayor) {
                ventamayor = ventas[i];
            }
        }

        // Cálculo de la venta menor
        ventaMenor = ventas[0];
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] < ventaMenor) {
                ventaMenor = ventas[i];
            }
        }

        // Ordenamiento de las ventas de forma descendente
        Arrays.sort(ventas);
        ventasDecendentes = new int[ventas.length];
        for (int i = 0; i < ventas.length; i++) {
            ventasDecendentes[i] = ventas[ventas.length - 1 - i];
        }

        // Desordenamiento aleatorio de las ventas
        desorden = new Object[ventas.length];
        for (int i = 0; i < ventas.length; i++) {
            desorden[i] = ventas[i];
        }
        Collections.shuffle(Arrays.asList(desorden));

        // Separación de ventas pares e impares
        int nPar = 0;
        int nImpar = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] % 2 == 0) {
                nPar++;
            } else {
                nImpar++;
            }
        }
    }

    /*
      Método getter para obtener la venta mayor.
     return String que representa la venta mayor.
     */
    public String getterVentamayor() {
        return "Venta Mayor: " + ventamayor;
    }

    /*
     Método getter para obtener la venta menor.
     return String que representa la venta menor.
     */
    public String getterVentaMenor() {
        return "Venta Menor: " + ventaMenor;
    }

    /*
     Método getter para obtener el promedio de ventas.
     return String que representa el promedio de ventas.
     */
    public String getterPromedio() {
        return "Promedio: " + promedio;
    }

    /*
     Método getter para obtener el número de venta actual.
     return String que indica el número de venta actual.
     */
    public String getterVenta() {
        return "Numeros de venta " + nventa + ":";
    }

    /*
     Método getter para obtener el arreglo de ventas.
     return Arreglo de enteros que representa las ventas.
     */
    public int[] getterVentas() {
        return this.ventas;
    }

    /**
     * Método getter para obtener el arreglo de ventas en orden descendente.
     * return Arreglo de enteros que representa las ventas en orden descendente.
     */
    public int[] getterDecendentes() {
        System.out.println("\"Orden Decendente\"");
        return ventasDecendentes;
    }

    /*
     Método getter para obtener el arreglo de ventas en orden ascendente.
     return Arreglo de enteros que representa las ventas en orden ascendente.
     */
    public int[] getterAcendentes() {
        System.out.println("\"Orden Acendente\"");
        return ventas;
    }

    /*
      Método setter para obtener el arreglo desordenado de ventas. return
      Arreglo de objetos que representa las ventas en un orden aleatorio.
     */
    public Object[] setterDesorden() {
        System.out.println("desordenado");
        return desorden;
    }

    /*
     Método getter para obtener el arreglo de ventas pares. return Arreglo de
     enteros que representa las ventas pares.
     */
    public int[] getterPar() {
        System.out.println("Numeros Par: ");
        return par;
    }

    /*
      Método getter para obtener el arreglo de ventas impares.
      return Arreglo de enteros que representa las ventas impares.
     */
    public int[] getterImpar() {
        System.out.println("Numeros imPar: ");
        return impar;
    }
}
