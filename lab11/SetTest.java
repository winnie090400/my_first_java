/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class SetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("JAVA");
        set.add("C++");
        set.add("Python");
        set.add("C#");
        set.add("JAVA");
        
        System.out.println("size"+set.size());
        System.out.println(set);
        
        System.out.println("----用for迴圈讀取Set集合----");
        for(String s:set){         //每次從集合讀取一個物件到s參考變數
            System.out.println(s);
        }
    }
    
}
