/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class 退貨車 {
    private ArrayList<可退貨的> a;
    
    public 退貨車(){
        a = new ArrayList<>();
    }
    
    public void 加入(可退貨的 x){
        a.add(x);
    }
    
    public void 顯示資料(){
        for(可退貨的 x:a){
            //instanceof 判斷物件是否為某種類型
            if(x instanceof 衣服){
                ((可顯示資料的)x).顯示資料();       //x 是可退貨的，只能執行 退貨資訊()，轉型成可顯示資料才能執行顯示資料()
            }
            
            System.out.println(x.退貨資訊());
            System.out.println("------------");
        }
    }
}
