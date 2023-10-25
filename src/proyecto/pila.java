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
}
