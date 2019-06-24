/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice01;

import lab08.*;
import java.util.ArrayList;


public class 購物車 {
    private ArrayList<衣服> a;
    private int 總金額;
    
    //建構子 初值設定
    public 購物車(){
       a = new ArrayList<>();
       總金額 = 0;
    }
    
    public void 加入(衣服 x){   //可傳入一個衣服參考給x
        總金額 += x.get價格();  //取得傳入的衣服價格，累積總金額
        a.add(x);              //將 x參考新增到陣列 
    }
    
    public void 顯示資料(){
        for (衣服 x : a){     //簡易方法跑過整個動態陣列，用冒號代表
            x.顯示資料();
            System.out.println("----------");
            
        }
        System.out.println("總金額" + 總金額);
    }
}
