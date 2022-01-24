/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanaiii;

import java.io.IOException;
import java.util.Arrays;
import semanai.Carro;

/**
 * Son ejercicios con matrices
 * @author pablonoguera
 */
public class MainMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {

//        Carro parqueo [][] = new Carro[4][4];
//        
//        parqueo[3][3] = new Carro();
        int[][] matriz
                = {
                    {15, 24, 3, 4, 0, -1},
                    {75, 6, 7, 8, 0, 1},
                    {9, 106, 1, 12, 0, 1},
                    {133, 14, 15, 16, 0, 1}
                };

        try {
            //throw new Exception();
            menores(matriz);
        } catch (Exception e) {
            //sentencias lekekekek
        }
//        System.out.println("Mayor es: "+ matriz[matriz.length-1][matriz[0].length-1]);

//      System.out.println(Arrays.toString(matriz));
//        
//         int valor = 55;
//         int pos = Arrays.binarySearch(c, valor);
//         System.out.println("Posición [index] "+valor+" : "+ pos);
//        System.out.println("Tamaño de matriz: "+ (matriz.length-1));
//
//        System.out.println("sumaDiagonalPrimaria: " + sumaDiagonalPrimaria(matriz));
//        System.out.println("sumaDiagonalSecundaria: " + sumaDiagonalSecundaria(matriz));
//System.out.println("Sumatoria: " + sumatoria(matriz2));
        //imprimir(matriz);
    }
    
    /**
     * 
     * @param matriz
     * @return 
     */
    public static int sumaDiagonalPrimaria(int matriz[][]) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public static int sumaDiagonalSecundaria(int matriz[][]) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }
 
    public static int sumatoria(int matriz[][]) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;

    }

    /**
     * Calcula el promedio  de los elementos de la matriz
     * @param matriz
     * @return El promedio
     */
    public static double promedio(int matriz[][]) {
        double suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma / (matriz.length * matriz[0].length);

    }

    /**
     * Mostrar los elementos de la matriz 
     * @param matriz 
     */
    public static void imprimir(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    /**
     * Determina los menores por fila de una matriz de tipo entera y luego 
     * determina el valor menor de la matriz, implementado la lib de los Arrays 
     * para ordenar los valores menores de todas las filas.
     * @param matriz Numeros enteros desordenados
     */
    public static void menores(int[][] matriz) {
        
     int menor = matriz[0][0];/// 15        
        int menores[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {//columnas
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menores[i] = menor;
            if ((i + 1 < matriz.length)) {
                menor = matriz[i + 1][0];
            }
        }

        for (int i = 0; i < menores.length; i++) {
            System.out.println("Menores port fila > " + menores[i]);
        }
        Arrays.sort(menores);
     
        System.out.println("Menor es: " + menores[0]);
    
    }

}
