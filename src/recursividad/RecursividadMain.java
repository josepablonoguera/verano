/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author admin
 */
public class RecursividadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5! 5*4*3*2*1  -- R/ 120
        //0!               R/ 0
        //1!               R/ 1 //caso base
        //2!               R/ 2 //caso base
        //3!               R/ 6

        /*int factorial = factorialIterativo(3);
        System.out.println("factorial = " + factorial);*/
        //  factorialRecursivo();
        // int factorialRec = factorialRecursivo(5);
        // System.out.println("factorialRec = " + factorialRec);
        // System.out.println("Potencia: "+ potencia(20, 4) );
        int vector[] = {1, 2, 3, 4, 5};
        int sumador = 0;
        for (int i = 0; i < vector.length; i++) {
            sumador += vector[i];
            System.out.println("vector[i]> " + vector[i]);
        }
        System.out.println("Resultado> " + sumador);

        System.out.println("Suma: " + sumaVector(vector, vector.length - 1));
        // 
    }

    private static int factorialIterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    private static int factorialRecursivo(int n) {

        if (n == 1 || n == 0) {// casos base
            return 1;
        }
        if (n == 2) {// casos base
            return 2;
        }

        return n * factorialRecursivo(n - 1);
    }
    // 2 3 

    private static long potencia(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        }
        if (exponente == 1) {
            return base;
        }

        return base * potencia(base, exponente - 1);

    }

    private static int sumaVector(int[] vec, int i) {

        if (i == 0) {
            return vec[0];
        }
        return vec[i] + sumaVector(vec, i - 1);
    }

}
