/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.ArrayList;


public class 動態陣列 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList 動態陣列，可任意加入或刪除物件(不限種類)
        //String  字串陣列，大小固定不變
        
        ArrayList a;
        a = new ArrayList();
        
        a.add("apple");
        a.add("banana");
        
        System.out.println(a); //完整寫法為 System.out.println(a.toString())
        
        //陣列大小 a.size
        System.out.println(a.size());
        
        //修改資料
        int index = 0;
        a.set(index, "tomato");
        
        //Object萬用字型
        Object obj = a.get(index);
        obj = "watermellon";
        //查詢索引位置 查尋不到 index=-1
        index = a.indexOf(obj);
        System.out.println(index);
        
        //刪除資料
        index = a.size()-1;    //最後一項
        obj = a.remove(index); //取出(刪除)最後一項
        
        //boolean 是否成功
        boolean 是否成功;
        obj = "banana";
        是否成功 = a.remove(obj);
        System.out.println("成功取出香蕉: "+是否成功);
    }
    
}
