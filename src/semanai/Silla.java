/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanai;

/**
 * Es una clase que permite crear un objeto de tipo silla gamer para vender
 * @author pablonoguera
 * 
 */
public class Silla {    
    
    private int confort; // 1 - minimo de confort y 10 - maximo confort    
    private int cantidad; // numero de sillas a disponibles para la venta
        
    
    private double descuento; // descuento particular por silla -- este rota -- con algun desperfecto
    private double impuestoVenta; // si es el 13% de venta sobre el precio unitario;
    private double precioUnitario;// precio base de la silla    
   
    private boolean disponibilidad; // si se encuentra para vender
       
    private String color; // rojo, amarilla, negra..... 

    /**
     * Constructor de la clase silla que inicializa los valores por default 
     */
    public Silla() {
        this.confort = 0; // no se ha definido el valor de la caracteristica
        this.cantidad = -1;//  no hay una cantidad definida
        this.precioUnitario = 0.0; // no se ha definido el valor de la caracteristica
        this.descuento = 0.0;// no se ha definido el valor de la caracteristica
        this.impuestoVenta = 0.0;
        this.disponibilidad = false;
        this.color = "rojo";  // N   O
    }
    /**
     * Constructor que permite recibir los valores por parametro y asigralo a los atributos
     * @param confort
     * @param cantidad
     * @param precioUnitario
     * @param descuento
     * @param impuestoVenta
     * @param disponibilidad
     * @param color 
     */
    public Silla(int confort, int cantidad, double precioUnitario, double descuento,
            double impuestoVenta, boolean disponibilidad, String color) {
        this.confort = confort;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
        this.impuestoVenta = impuestoVenta;
        this.disponibilidad = disponibilidad;
        this.color = color;
    }

    /**
     * @return the confort
     */
    public int getConfort() {
        return confort;
    }

    /**
     * @param confort the confort to set
     */
    public void setConfort(int confort) {
        this.confort = confort;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the impuestoVenta
     */
    public double getImpuestoVenta() {
        return impuestoVenta;
    }

    /**
     * @param impuestoVenta the impuestoVenta to set
     */
    public void setImpuestoVenta(double impuestoVenta) {
        this.impuestoVenta = impuestoVenta;
    }

    /**
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Regresa todos los atributos  de la clase de forma concatenada
     * @return String(Todos los atributos)
     */
    @Override
    public String toString() {
        return "Silla{" + "Confort=" + confort + ", Cantidad=" + cantidad +
                ", Descuento=" + descuento + ", ImpuestoVenta=" + impuestoVenta 
                + ", PrecioUnitario=" + precioUnitario + ", Disponibilidad=" 
                + disponibilidad + ", Color=" + color + '}';
    }

      
    
    
    
    
}
