/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanai;

import claseshijas.Comprador;
import claseshijas.Vendedor;
import clasesprincipales.Persona;
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
    //static PuntoVenta puntosVenta[] = new PuntoVenta[500];

    public static void main(String[] args) {
        
        Integer x = new Integer(5);
        int x1= 5;
        System.out.println( x1 );
        System.out.println( x.intValue());
        
        
        Silla nueva = new Silla();//   /28 bytes   /32 bytes  //36 bytes
        
  //      Persona person1 = new Persona();
//        person1.setCedula("603490098");
//        person1.setNombre("Juan");
//        
//        
//        Comprador comprador1 = new Comprador();
//        comprador1.setCedula("021470841");
//        comprador1.setNombre("Pedro");
//        comprador1.setDescuento(50);
//        
//        
       Vendedor vendedor1 = new Vendedor(1, null);
//        
//        vendedor1.getCodigoVendedor();
//        
//        vendedor1.setCedula("0125784");
//        vendedor1.setNombre("Maria");
//        
//        
//        Persona [] usuarios = new Persona[3];
//        
//        usuarios [0] = person1;
//        usuarios [1] = comprador1;
//        usuarios [2] = vendedor1;
//        
////        for (int i = 0; i <  person1.getClass().getConstructors().length; i++) {
////            System.out.println("Constructores > ");
////            System.out.println(person1.getClass().getConstructors()[i]);
////        }
//        
//        System.out.println("");
//        
//        for (Persona usuario : usuarios) {
//           
//            if (usuario instanceof Vendedor) {
//                Vendedor obj = (Vendedor) usuario;
//                System.out.println("Es una Persona Vendedora> ");
//                System.out.println(obj.getCodigoVendedor());
//            }
//            if (usuario instanceof Comprador) {
//                System.out.println("Es una Persona Compradora > ");
//                System.out.println(usuario.toString());
//            }
//        }
//        
        
//        
//        for (Persona usuario : usuarios) {
//            if (usuario.getClass().getSimpleName().equals("Persona")) {
//                System.out.println("Es una Persona > ");
//                System.out.println(usuario.toString());
//            }
//            if (usuario.getClass().getSimpleName().equals("Vendedor")) {
//                System.out.println("Es una Persona Vendedora> ");
//                System.out.println(usuario.toString());
//            }
//            if (usuario.getClass().getSimpleName().equals("Comprador")) {
//                System.out.println("Es una Persona Compradora > ");
//                System.out.println(usuario.toString());
//            }
//        }
//        Carro parqueo[] = new Carro[50];
//        
//        Carro bmw = new Carro("FGN456", null, null, 2000);
//        
//        parqueo [0]= bmw;
//
//
//        int c [] = {2, 4, 23, 5, 12};
//
//
//        
//        for (int valor : c){
//            System.out.println(valor);
//        }
//
//        
//        imprimir(c);
//        System.out.println("Sumatoria: "+ sumatoriaVector(c));
//        System.out.println("Promedio: "+ promedioVector(c));
//        Arrays.sort(c);
//        imprimir(c);
//        System.out.println("Menor es: "+ c[0]);
//        System.out.println("Mayor es: "+ c[c.length-1]);
//
//       
//        System.out.println(Arrays.toString(c));
//        
//         int valor = 55;
//         int pos = Arrays.binarySearch(c, valor);
//         System.out.println("Posición [index] "+valor+" : "+ pos);
        
        

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
