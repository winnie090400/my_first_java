/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.ArrayList;


public class 用迴圈讀取動態列Test {

   
    public static void main(String[] args) {
        //建立動態陣列
        ArrayList a;
        a = new ArrayList();
        
        //放入物件
        a.add("國文");
        a.add("英文");
        a.add("數學");
        
        //迴圈讀取陣列
        for (int i=0;i<a.size();i++){    //注意:條件分隔為冒號非逗號
            Object obj;
            obj = a.get(i);  //讀取物件
            System.out.println(obj);
        }
        
        ArrayList b;
        b = new ArrayList();
        b.add(100);   //完整寫法 b.add( new Integer(100)); 建立int物件加入陣列
        b.add(90);
        b.add(80);
        
        for (int i=0;i<b.size();i++){
            Object obj;
            obj = b.get(i);  //讀取物件
            System.out.println(obj);
        }
        
    }
    
}
