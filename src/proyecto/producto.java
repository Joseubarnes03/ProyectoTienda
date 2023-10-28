/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author danie
 */
public class producto {
   
    String id;
    String nom;
    String fechal;
    String fechav;
    float precio;
    
    public producto(){
        id = "";
        nom = "";
        fechal = "";
        fechav = "";
        precio = -1;
    }
    public producto (String id, String nom, String fechal, String fechav, float precio){
        this.id = id;
        this.nom = nom;
        this.fechal = fechal;
        this.fechav = fechav;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFechal() {
        return fechal;
    }

    public void setFechal(String fechal) {
        this.fechal = fechal;
    }

    public String getFechav() {
        return fechav;
    }

    public void setFechav(String fechav) {
        this.fechav = fechav;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
