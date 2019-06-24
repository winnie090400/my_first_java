/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 裝飾Model;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       餐廳 restaurant = new 餐廳();
       簡餐 simple = new 簡餐(restaurant);
        System.out.println("簡餐: ");
        simple.order();
        
        超值午餐 business = new 超值午餐(restaurant);
        System.out.println("超值午餐: ");
        business.order();
        
        全餐 full = new 全餐(restaurant);
        System.out.println("全餐: ");
        full.order();
    }
    
}
