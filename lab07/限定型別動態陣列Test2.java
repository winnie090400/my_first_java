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
public class 限定型別動態陣列Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("C");
        a.add("C++");
        a.add("Python");
        
        for(String s:a){
            System.out.println(s);
        }
        
    }
    
}
