/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciohotellabprogra2;
import java.util.*;

/**
 *
 * @author sebastianmorales
 */
public class EjercicioHotelLabProgra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner zeus = new Scanner (System.in);
        int csen = 1200;
        int cdob = 3400;
        int csui = 5000;
        int total = 0;
        int conth = 0;
        int contd = 0;
        int opc;
        int habitaciones[][] = new int[6][6];
       
        do{
        System.out.println("\n*****Menu Hotel*****");
        System.out.println("\n1. Reservar Habitacion");
        System.out.println("2. Checkout");
        System.out.println("3. Informacion");
        System.out.println("4. Salir");
        System.out.print("\nIngrese su Opcion: ");
        opc = zeus.nextInt();
        
        switch(opc){
            case 1:
                String opc2;
                System.out.println("\nOpcion Escogida: \"Reservar Habitacion\"");
                System.out.println("*****Menu Reservacion*****");
                System.out.println("\nA. Habitacion Sencilla");
                System.out.println("B. Habitacion Doble");
                System.out.println("C. Suite");
                System.out.print("\nIngrese su Opcion: ");
                opc2 = zeus.next().toUpperCase();
                
                switch(opc2){
                    case "A":
                        System.out.println("\nOpcion Escogida: \"Habitacion Sencilla\"");
                        for(int f=0;f<=5;f++){
                            for(int c=0;c<=5;c++){
                                if(habitaciones[f][c]==0){
                                    habitaciones[f][c]+=1;
                                    System.out.println("\nHabitacion Reservada Exitosamente!!!");
                                }else if(habitaciones[f][c]!=0){
                                    System.out.println("\nHabitacion Ocupada");
                                }
                            }//End For Anidado
                        }//End For
                        total+=csen;
                        System.out.print("\nCosto de Habitacion Sencilla: " + total);
                        conth++;
                        contd=total;                        
                        break;
                    case "B":
                         System.out.println("\nOpcion Escogida: \"Habitacion Doble\"");
                        for(int f=0;f<=5;f++){
                            for(int c=0;c<=5;c++){
                                if(habitaciones[f][c]==0){
                                    habitaciones[f][c]+=1;
                                    System.out.println("\nHabitacion Reservada Exitosamente!!!");
                                }else if(habitaciones[f][c]!=0){
                                    System.out.println("\nHabitacion Ocupada");
                                }
                            }//End For Anidado
                        }//End For
                        System.out.println("\nHabitacion Reservada Exitosamente!!!");
                        total+=cdob;
                        System.out.print("\nCosto de Habitacion Doble: " + total);
                        conth++;
                        contd=total;  
                        break;
                    case "C":
                         System.out.println("\nOpcion Escogida: \"Habitacion Suite\"");
                        for(int f=0;f<5;f++){
                            for(int c=0;c<=5;c++){
                                if(habitaciones[f][c]==0){
                                    habitaciones[f][c]+=1;
                                    System.out.println("\nHabitacion Reservada Exitosamente!!!");
                                }else if(habitaciones[f][c]!=0){
                                    System.out.println("\nHabitacion Ocupada");
                                }
                            }//End For Anidado
                        }//End For
                        System.out.println("\nHabitacion Reservada Exitosamente!!!");
                        total+=csui;
                        System.out.print("\nCosto de Habitacion Suite: " + total);
                        conth++;
                        contd=total;  
                        break;
                }
                break;
            case 2:
                System.out.println("\nOpcion Escogida: \"Checkout\"");
                break;
            case 3:
                System.out.println("\nOpcion Escogida: \"Informacion\"");
                System.out.print("\nTotal Habitaciones Ocupadas: " + conth);
                System.out.print("\nTotal (Dinero) en Habitaciones: " + contd);
                break;
            case 4:
                System.out.println("\nOpcion Escogida: \"Salir\"");
                System.out.println("Hasta Luego!!!");
                System.exit(0);
                break;
        }//End Switch
       
        }while(opc!=4);
    }//End Main
    
}//End Class
