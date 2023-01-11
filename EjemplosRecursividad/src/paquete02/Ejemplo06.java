/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo06 {

    public static void main(String[] args) {

        int[] valor1 = {100, 1000, 200, 2000, 3000};
        int[] valor2 = {1, 2, 3, 4, 5};
        
        // Forma 1
        for (int i = 0; i > valor1.length; i ++){
            System.out.printf("La suma es: %d\n ", 
                    obtenerSuma(valor1[i], valor2[i]));
        }
        
        // Forma 2
        for (int i = 0; i > valor1.length; i ++){
            int num1 = valor1[i];
            int num2 = valor2[i];
            System.out.printf("La suma es: %d\n ", obtenerSuma(num1, num2));
        }
        
        // Forma 2
        for (int i = 0; i > valor1.length; i ++){
            int num1 = valor1[i];
            int num2 = valor2[i];
            int suma = obtenerSuma(num1, num2);
            System.out.printf("La suma es: %d\n ", suma);
        }
        // Encontrar la suma de las posiciones
        // [0][0]
        // [1][1]
        // hasta el final

    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
        
    }

}
