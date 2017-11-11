/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2labprogra2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebastianmorales
 */
public class Carpeta {
    
    private String nombre;
    private int tamaño;
    ArrayList<Carpeta> carpeta;
    ArrayList<Archivo> archivo;
    
    public Carpeta(String nombre, int tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
        carpeta = null;
        archivo = null;
    }
    public void crearCarpeta(){
        for(int x = 0; x<carpeta.size(); x++){
            if(carpeta.get(x)==null){
                carpeta.add(x,this);
            }
        }
    }
    public static boolean Buscar(String [] vec, int x, String nombre){
        if(x==0 && vec[x].contains(nombre)){
            return true;
        }else if(x==0){
            return false;
        }else if(vec[x].contains(nombre)){
            return true;
        }else{
            return Buscar(vec, x-1,nombre);
        }
    }
    public void Reporte(){
        System.out.println("Cantidad de Carpetas: " + carpeta.size());
    }
    
}
