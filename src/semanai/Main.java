/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanai;

import java.util.Arrays;
import semanaii.PuntoVenta;

/**
 *
 * @author pablonoguera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static PuntoVenta puntosVenta[] = new PuntoVenta[500];

    public static void main(String[] args) {
        
     
        
        Carro parqueo[] = new Carro[50];
        
        Carro bmw = new Carro("FGN456", null, null, 2000);
        
        parqueo [0]= bmw;
               

        int c [] = {2, 4, 23, 5, 12};
        
            
        
        for (int valor : c){
            System.out.println(valor);
        }
        
        
        imprimir(c);
        System.out.println("Sumatoria: "+ sumatoriaVector(c));
        System.out.println("Promedio: "+ promedioVector(c));
        Arrays.sort(c);
        imprimir(c);
        System.out.println("Menor es: "+ c[0]);
        System.out.println("Mayor es: "+ c[c.length-1]);
        
       
        System.out.println(Arrays.toString(c));
        
         int valor = 55;
         int pos = Arrays.binarySearch(c, valor);
         System.out.println("Posición [index] "+valor+" : "+ pos);
        
        

    }
    /**
     * Es un método que retorna un entero con la sumatoria de
       todos los valores contenidosen un arreglo de tipo entero
     * @param vector los valores enteros a sumar
     * @return la sumatoria de todos los valores del vector
     */
    public static int sumatoriaVector(int vector[]) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }

        return suma;

    }
    
    /**
     * Es un método que retorna un double con el promedio de
       todos los valores contenidos en un arreglo de tipo entero
     * @param vector los valores enteros a sumar
     * @return el promedio de los valores del vector
     */
    public static double promedioVector(int vector[]) {
        double suma = 0.0;
        
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
     

        return suma / vector.length;

    }
    
    public static void imprimir(int vector[]) {
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector["+i+"] = "+ vector[i]);
        }
    }

}
