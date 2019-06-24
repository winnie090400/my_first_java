/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author User
 */
public class CollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        
        幫你放東西(list);
        幫你放東西(set);
   
    }
    private static void 幫你放東西(Collection c){
        if(c instanceof List){
            System.out.println("List有順序性");
        }
        if(c instanceof Set){
            System.out.println("Set無順序性、不重複");
        }
        c.add("JAVA");
        c.add("C++");
        c.add("Python");
        c.add("C#");
        c.add("JAVA");
        System.out.println("size"+c.size());
        System.out.println(c);
        System.out.println();
    }
}
