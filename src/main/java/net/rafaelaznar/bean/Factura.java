package net.rafaelaznar.bean;
// Generated Jan 21, 2014 12:40:47 PM by Hibernate Tools 3.6.0

import java.util.Date;

/**
 * Factura generated by hbm2java
 */
public class Factura implements java.io.Serializable {

    private Integer id = 0; //ojo, poner valores por defecto
    private Date fecha;

    public Factura() {
    }

    public Factura(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
