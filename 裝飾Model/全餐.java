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
public class 全餐 extends 簡餐{
    
    public 全餐(餐廳 restaurant) {
        super(restaurant);
    }
    
    private void 甜點(){
        System.out.println("一份甜點");
    }
    
    @Override
    public void order(){
        super.order();
        甜點();
    }
    
}
