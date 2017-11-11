/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author sebastianmorales
 */
public class MCD_Euclides {
    
    public int x;
    public int y;
    public int z;
    
    public MCD_Euclides(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static int MCD(int x, int y, int z){
        if(z==0){
            return x;
        }else if(y==0){
            return MCD(z,y,x%z);
        }else{
            return MCD(y,x%y,z);
        }
    }
    public static void main(String[] args) {
        Scanner zeus = new Scanner(System.in);
        System.out.print("Ingrese Primer Valor: ");
        int x = zeus.nextInt();
        System.out.print("Ingrese Segundo Valor: ");
        int y = zeus.nextInt();
        System.out.print("Ingrese Tercer Valor: ");
        int z = zeus.nextInt();
        System.out.println("El MCD de los Tres Valores Ingresados es: " + MCD(x,y,z));
    }
    
}
