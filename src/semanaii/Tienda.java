/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanaii;

import clasesprincipales.Persona;

/**
 *
 * @author pablonoguera
 */
public class Tienda {
    
    private Persona encargado; // comp
    
    private PuntoVenta puntoVenta;// comp
    
    private String cedulaJuridica; // comp
    private String direccion;      // comp
      
    private String nombre;    // comp    
    private String telefono;  // comp

    public Tienda() {
    }

    public Tienda(Persona encargado, PuntoVenta puntoVenta,
            String cedulaJuridica, String direccion,
            String nombre, String telefono) {
        this.encargado = encargado;
        this.puntoVenta = puntoVenta;
        this.cedulaJuridica = cedulaJuridica;
        this.direccion = direccion;
    
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * @return the encargado
     */
    public Persona getEncargado() {
        return encargado;
    }

    /**
     * @param encargado the encargado to set
     */
    public void setEncargado(Persona encargado) {
        this.encargado = encargado;
    }

    /**
     * @return the puntoVenta
     */
    public PuntoVenta getPuntoVenta() {
        return puntoVenta;
    }

    /**
     * @param puntoVenta the puntoVenta to set
     */
    public void setPuntoVenta(PuntoVenta puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    /**
     * @return the cedulaJuridica
     */
    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    /**
     * @param cedulaJuridica the cedulaJuridica to set
     */
    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
   
    
    
}
