/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Orderpizza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int l;
        double d =0;
        
        
        Pizza[] orden = new Pizza[10];
        System.out.println("Bienvenido a ordenar 10 pizzas por el precio de 1 ingresa los datos a continuacion");
        for(int i=0;i<9;i++){
            orden[i] = new Pizza();
            System.out.println("ingresa el sabor de la pizza #"+ (i+1));            
            s = scan.next();
            orden[i].setIng(s);
            System.out.println("ingresa el tamaño de la pizza #" + (i+1)); 
            l = scan.nextInt();
            orden[i].setTam(l);
            System.out.println("ingresa el precio de la pizza #" + (i+1));
            d = scan.nextDouble();
            orden[i].setPre(d);
        }
        System.out.println("Tu orden es");
        for(int i=0;i<9;i++){
            System.out.println("la pizza #" +(i+1));
            System.out.println(" el sabor de la pizza #"+ (i+1)+"es: " +orden[i].getIng());            
            System.out.println(" el tamaño de la pizza #"+ (i+1)+"es: " +orden[i].getTam());  
            System.out.println(" el Precio de la pizza #"+ (i+1)+"es: " +orden[i].getPre());  
            
        }
    }
}
