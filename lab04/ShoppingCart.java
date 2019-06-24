/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author User
 */
public class ShoppingCart {
    int total = 0;
    
    public void add(Product x){
        System.out.println("add\t"+x.toString());
        total += x.price;
    }
    
    public void displayTotal(){
        System.out.println("合計" + total);
    }
}
