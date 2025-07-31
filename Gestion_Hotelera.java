/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Hotel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alonso
 */
public class Gestion_Hotelera {
    private static Gestion_Hotelera uniqueInstance;
    private ArrayList<Hotel> lista_hotel = new ArrayList<>();

    public Gestion_Hotelera() {
    }
    
    public static Gestion_Hotelera getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Gestion_Hotelera();
        }
        return uniqueInstance;
    }
    
    public double precios(String tipo_habitacion){
        switch (tipo_habitacion) {
            case "Habitación normal":
                return 146;
            case "Habitación lujosa":
                return 378;
            default: return 0;
        }
    }
    
    public void agregar(Hotel hotel){
        lista_hotel.add(hotel);
    }
    
    public void mostrar_Datos(JTable tablita){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Tipo de habitación");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha de ingreso");
        modelo.addColumn("Fecha de retiro");
        modelo.addColumn("Cantidad personas");
        for (Hotel hotel : lista_hotel) {
            Object[]fila = {hotel.getCodigo_habitacion(), hotel.getTipo_habitacion(), hotel.getPrecio_habitacion(),
            hotel.getFecha_ingreso(), hotel.getFecha_final(), hotel.getCantidad_personas()};
            modelo.addRow(fila);
        }
        tablita.setModel(modelo);
    }
    
    public double total_Dinero(){
        double dinero = 0;
        for (Hotel hotel : lista_hotel) {
            dinero+= hotel.getPrecio_habitacion();
        }
        return dinero;
    }
}