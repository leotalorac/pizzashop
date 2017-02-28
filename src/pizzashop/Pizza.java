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
public class Pizza {
    private String ingrediente;
    private int tama;
    private double precio;
    
    public void setIng(String i){
        this.ingrediente = i;
    }
    public void setTam(int t){
        this.tama = t;
    }
    public void setPre(double p){
        this.precio = p;
    }
    
    public String getIng(){
        return this.ingrediente;
    }
    public int getTam(){
        return this.tama;
    }
    public double getPre(){
        return(this.precio);
    }
    
    
    
    
    
    
}
