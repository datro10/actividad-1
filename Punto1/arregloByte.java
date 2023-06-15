/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author cerda
 */
public class arregloByte {

    public static void main(String[] args) {
        Byte[] arregloByte = new Byte[5];
        
        
        arregloByte[0] = 1;
        arregloByte[1] = 2;
        arregloByte[2] = 63;
        arregloByte[3] = 64;
        arregloByte[4] = 125;

        
         for(int i=0; i<arregloByte.length; i++){
        
            System.out.println(arregloByte[i]);
        
        }
    }
}
