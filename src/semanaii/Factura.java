/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanaii;

import claseshijas.Comprador;
import claseshijas.Vendedor;
import java.util.Date;
import semanai.Silla;

/**
 *
 * @author pablonoguera
 */
public class Factura {
    
    private Comprador comprador; // comp
    private Date fechaFactura;// comp
    private Garantia garantia; // asoc
    private Silla silla;    // comp
    private Vendedor vendedor; //agreg
    

    public Factura() {
    }

    public Factura(Comprador comprador, Date fechaFactura, 
            Garantia garantia, Silla silla, Vendedor vendedor) {
        this.comprador = comprador;
        this.fechaFactura = fechaFactura;
        this.garantia = garantia;
        this.silla = silla;
        this.vendedor = vendedor;
    }   

    /**
     * @return the comprador
     */
    public Comprador getComprador() {
        return comprador;
    }

    /**
     * @param comprador the comprador to set
     */
    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    /**
     * @return the fechaFactura
     */
    public Date getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    /**
     * @return the silla
     */
    public Silla getSilla() {
        return silla;
    }

    /**
     * @param silla the silla to set
     */
    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the garantia
     */
    public Garantia getGarantia() {
        return garantia;
    }

    /**
     * @param garantia the garantia to set
     */
    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }
   
    
    
}
