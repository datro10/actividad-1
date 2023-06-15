/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

import java.util.Scanner;

/**
 *
 * @author cerda
 */
public class PuntoEyF {
    public static void main(String[] args) {
        // Declarar y definir arreglo dataStructs
        
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};

        // Declarar y definir arreglo características
        
        String[] características = {"Simple", "Circular", "Enlazada", "FIFO", "LIFO"};

        // Solicitar al usuario ingresar los datos de cada característica
        
        Scanner scanner = new Scanner(System.in);
        String[] entradas = new String[5];
        System.out.println("Ingrese el tipo de estructura de datos para cada característica:");
        System.out.print("1. Tipo de lista (simple, circular, enlazada): ");
        entradas[0] = scanner.nextLine();
        System.out.print("2. Ordenamiento de la cola (FIFO o LIFO): ");
        entradas[1] = scanner.nextLine();
        System.out.print("3. Ordenamiento de la pila (LIFO): ");
        entradas[2] = scanner.nextLine();
        System.out.print("4. Tipo de mapa (parejas de clave y valor): ");
        entradas[3] = scanner.nextLine();
        System.out.print("5. Tipo de conjunto (elementos no repetidos): ");
        entradas[4] = scanner.nextLine();

        // Mostrar los elementos del arreglo dataStructs con su equivalente elemento del arreglo características
        
        System.out.println("\nCaracterísticas de estructuras de datos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(dataStructs[i] + " - " + características[i] + " " + entradas[i]);
        }
    }
}








