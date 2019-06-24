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
public class 超值午餐 extends 餐廳{

    private 餐廳 restaurant;
    
    public 超值午餐(餐廳 restaurant){
        this.restaurant = restaurant;
    }
    
    private void 沙拉(){
        System.out.println("一盤沙拉");
    }
    
    private void 主餐(){
        System.out.println("一份主餐");
    }
    
    @Override
    public void order(){
        super.order();
        沙拉();
        主餐();
        
    }
}
