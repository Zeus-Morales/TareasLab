/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2labprogra2;

/**
 *
 * @author sebastianmorales
 */
public class Archivo {
    private String nombre;
    private int tamaño;
    private String extension;
    
    public Archivo(String nombre, int tamaño, String extension){
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.extension = extension;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTamaño(){
        return tamaño;
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    public String getExtension(){
        return extension;
    }
    public void setExtension(String extension){
        this.extension = extension;
    }
    
}
