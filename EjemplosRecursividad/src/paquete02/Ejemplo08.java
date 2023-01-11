/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese el numero de tamaño  del arreglo");
        int num = entrada.nextInt();
        int [] arreglo = new int[num];
        
        for (int i = 0; i < arreglo.length; i ++){
            System.out.println("Ingrese un valor");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.printf("La suma de los valores del arreglo son: %d\n", 
                misterio(arreglo, num));

        
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
