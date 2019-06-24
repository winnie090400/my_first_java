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
public class 簡餐 extends 超值午餐{
    
    public 簡餐(餐廳 restaurant) {
        super(restaurant);
    }
    
    private void 湯(){
        System.out.println("一份湯");
    }
    
    public void order(){
        super.order();
        湯();
    }
    
}
