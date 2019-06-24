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
public class 餐廳 {
    private void 低消(){
        System.out.println("一杯飲料");
    }
    
    public void order(){
        低消();
    }
}
