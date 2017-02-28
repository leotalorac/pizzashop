/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 *
 * @author Estudiante
 */
public class PizzaShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza luispizza = new Pizza();
        System.out.println("La pizza de luis tiene:");
        luispizza.setIng("carnes");
        luispizza.setTam(12);
        luispizza.setPre(13);
        System.out.println(luispizza.getTam());
        System.out.println(luispizza.getIng());
        System.out.println(luispizza.getPre());
        System.out.println("La pizza de javier tiene:");
        Pizza javierpizza = new Pizza();
        javierpizza.setIng("mexicana");
        javierpizza.setTam(6);
        javierpizza.setPre(8.6);
        System.out.println(javierpizza.getTam());
        System.out.println(javierpizza.getIng());
        System.out.println(javierpizza.getPre());
        
        
        
        
    }
    
}
