/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class pila {
    private Stack<producto> pila;
    public pila(){
        this.pila = new Stack<>();
    }
    public void setPushProducto (producto p){
        if(buscarID(p.id) != null){
            JOptionPane.showMessageDialog(null, "Ya existe un producto con este ID!");
        }else if(buscarNOM(p.nom) != null){
            JOptionPane.showMessageDialog(null, "Ya existe un producto con este Nombre!");
        }else{
            pila.push(p);
            mainFXMLController.lista.add(p);
            JOptionPane.showMessageDialog(null, "Producto registrado!");
        }
    }
    
    public producto buscarID(String id){
        producto buscar = new producto();
        int i = 0;
        while(i<pila.size()){
            buscar = (producto) pila.get(i);
            if(buscar.id.equals(id))
                return buscar;
            i++;
        }
        buscar = null;
        return buscar;
    }
    public producto buscarNOM(String nom){
        producto buscar = new producto();
        int i = 0;
        while(i<pila.size()){
            buscar = (producto) pila.get(i);
            if(buscar.nom.equals(nom))
                return buscar;
            i++;
        }
        buscar = null;
        return buscar;
    }
    public void productoexpirado(){
        String fecha = mainFXMLController.fecha;
        for(producto eliminar : pila){
            if (eliminar.fechav.equals(fecha)){
                pila.remove(eliminar);
                mainFXMLController.lista.remove(eliminar);
            }
        }
    }
    public void buscarFechal(String fechal){
        producto buscar = new producto();
        int i = 0;
        while(i<pila.size()){
            buscar = (producto) pila.get(i);
            if(buscar.fechal.equals(fechal)){
                JOptionPane.showMessageDialog(null, "El producto con la fecha lote buscada es:\n"
                                                    + "ID: " + buscar.id + "\n"
                                                    + "Nombre: " + buscar.nom + "\n"
                                                    + "Fecha lote: " + buscar.fechal + "\n"
                                                    + "Fecha vencimiento: " + buscar.fechav + "\n"
                                                    + "Precio: " + buscar.precio);
            }
        }
    }
    public void buscarFechav(String fechav){
        producto buscar = new producto();
        int i = 0;
        while(i<pila.size()){
            buscar = (producto) pila.get(i);
            if(buscar.fechav.equals(fechav)){
                JOptionPane.showMessageDialog(null, "El producto con la fecha de vencimiento buscada es:\n"
                                                    + "ID: " + buscar.id + "\n"
                                                    + "Nombre: " + buscar.nom + "\n"
                                                    + "Fecha lote: " + buscar.fechal + "\n"
                                                    + "Fecha vencimiento: " + buscar.fechav + "\n"
                                                    + "Precio: " + buscar.precio);
            }
        }
    }
    public void buscarprecio(float precio){
        producto buscar = new producto();
        int i = 0;
        while(i<pila.size()){
            buscar = (producto) pila.get(i);
            if(buscar.precio == precio){
                JOptionPane.showMessageDialog(null, "El producto con el precio buscado es:\n"
                                                    + "ID: " + buscar.id + "\n"
                                                    + "Nombre: " + buscar.nom + "\n"
                                                    + "Fecha lote: " + buscar.fechal + "\n"
                                                    + "Fecha vencimiento: " + buscar.fechav + "\n"
                                                    + "Precio: " + buscar.precio);
            }
        }
    }
}
