/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class 限定型別動態陣列Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(90);
        a.add(95);
        a.add(80);
        //a.add(3.14) false
        //a.add("Hi") false
        System.out.println(a);
        
        //普通for迴圈
        for(int i=0; i< a.size(); i++){
            Integer intObj = a.get(i);           //讀取第i項物件
            int intValue = intObj.intValue();    //Unboxing 拆箱(從物件裡讀取int值)
            String s = "第"+i+"項"+intValue;
            System.out.println(s);
        }
        
        //加強for迴圈
        for(int intValue:a){
            System.out.println(intValue);
        }
    }
    
}
