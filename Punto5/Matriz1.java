/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pbape
 */
public class Matriz1 {

    public static void main(String[] args) {

        // Se define una cadena de nombre "java"
        String nombre = "java";

        // Se crea una matriz bidimensional de objetos de tamaño 5x8
        Object[][] lenguajes = new Object[5][8];

        // Se asigna la primera fila de la matriz con etiquetas de información
        lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};

        // Se llama al método infoLenguajes para ingresar datos a la matriz
        infoLenguajes(lenguajes);

        // Se imprime la matriz para verificar los datos ingresados
        for (Object[] fila : lenguajes) {
            for (Object elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        // Se busca el lenguaje "Java" en la matriz
        boolean encontrado = buscarLenguaje(lenguajes, "Java");
        System.out.println(encontrado); // Imprime true si se encuentra

        // Se buscan las coordenadas del lenguaje "Java" en la matriz
        int[] coordenadas = buscarCoordenadas(lenguajes, "Java");
        if (coordenadas != null) {
            System.out.println("El lenguaje se encuentra en la fila " + coordenadas[0] + ", columna " + coordenadas[1]);
        } else {
            System.out.println("El lenguaje no se encuentra en la matriz");
        }

        // Se intenta obtener una columna de la matriz y se imprime el resultado
        try {
            Object[] columna = obtenerColumna(lenguajes, 2); // Se obtiene la tercera columna (índice 2)
            System.out.println(Arrays.toString(columna)); // Se imprime la columna obtenida
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Se imprime el mensaje de error en caso de excepción
        }
    }
// Se utiliza un escáner para ingresar los datos de los lenguajes en la matriz

    public static void infoLenguajes(Object[][] lenguajes) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < lenguajes.length; i++) {
            System.out.println("Ingrese los datos para el lenguaje " + i + ":");
            for (int j = 0; j < lenguajes[i].length; j++) {
                lenguajes[i][j] = scanner.nextLine();
            }
        }
    }
    // Se busca un lenguaje específico en la matriz y se devuelve true si se encuentra

    public static boolean buscarLenguaje(Object[][] lenguajes, String nombreLenguaje) {

        for (int i = 1; i < lenguajes.length; i++) {
            if (lenguajes[i][0].equals(nombreLenguaje)) {
                return true;
            }
        }
        return false;
    }
// Se buscan las coordenadas (fila y columna) de un lenguaje específico en la matriz

    public static int[] buscarCoordenadas(Object[][] lenguajes, String nombreLenguaje) {

        for (int i = 1; i < lenguajes.length; i++) {
            if (lenguajes[i][0].equals(nombreLenguaje)) {
                return new int[]{i, 0};
            }
        }
        return null;
    }
// Se obtiene una fila específica de la matriz

    public static Object[] obtenerFila(Object[][] lenguajes, int fila) throws Exception {

        if (fila < 1 || fila >= lenguajes.length) {
            throw new Exception("La fila no existe en la matriz");
        }
        return lenguajes[fila];
    }
    // Se obtiene una columna específica de la matrizs

    public static Object[] obtenerColumna(Object[][] lenguajes, int columna) throws Exception {

        if (columna < 0 || columna >= lenguajes[0].length) {
            throw new Exception("La columna no existe en la matriz");
        }
        Object[] datos = new Object[lenguajes.length];
        for (int i = 0; i < lenguajes.length; i++) {
            datos[i] = lenguajes[i][columna];
        }
        return datos;
    }
}
