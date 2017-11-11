/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2labprogra2;
import java.util.Scanner;

/**
 *
 * @author sebastianmorales
 */
public class MainEjercicio2LabProgra2 {
    public static void main(String[] args) {
        Scanner zeus = new Scanner(System.in);
        int opc;
        Carpeta carpeta = new Carpeta("",0);
        Archivo archivo = new Archivo("",0,"");
        do{
            System.out.println("\n*****Menu*****");
            System.out.println("\n1. Buscar Carpeta");
            System.out.println("2. Crear Carpetas");
            System.out.println("3. Crear Archivos");
            System.out.println("4. Reporte");
            System.out.println("5. Salir");
            System.out.print("\nIngrese su Opcion: ");
            opc = zeus.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("\nOpcion Ingresada: \"Buscar Carpeta\"");
                    
                    break;
                case 2:
                    System.out.println("\nOpcion Ingresada: \"Crear Carpetas\"");
                    carpeta.crearCarpeta();
                    break;
                case 3:
                    System.out.println("\nOpcion Ingresada: \"Crear Archivos\"");
                    break;
                case 4:
                    System.out.println("\nOpcion Ingresada: \"Reporte\"");
                    carpeta.Reporte();
                    break;
                case 5:
                    System.out.println("\nOpcion Ingresada: \"Salir\"");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Porfavor Ingrese una Opcion Valida");
                    break;
            }
        }while(opc != 5);
    }
    
}
