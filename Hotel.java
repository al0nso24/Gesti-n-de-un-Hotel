/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alonso
 */
public class Hotel {
    String codigo_habitacion;
    String tipo_habitacion;
    double precio_habitacion;
    String fecha_ingreso, fecha_final;
    int cantidad_personas;

    public Hotel(String codigo_habitacion, String tipo_habitacion, String fecha_ingreso, String fecha_final, int cantidad_personas) {
        this.codigo_habitacion = codigo_habitacion;
        this.tipo_habitacion = tipo_habitacion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_final = fecha_final;
        this.cantidad_personas = cantidad_personas;
    }

    public String getCodigo_habitacion() {
        return codigo_habitacion;
    }

    public void setCodigo_habitacion(String codigo_habitacion) {
        this.codigo_habitacion = codigo_habitacion;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public int getCantidad_personas() {
        return cantidad_personas;
    }

    public void setCantidad_personas(int cantidad_personas) {
        this.cantidad_personas = cantidad_personas;
    }
    
}
