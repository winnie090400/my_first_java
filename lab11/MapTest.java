/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class MapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Map<key, value>
        Map<String, String> m= new HashMap<>();
        m.put("Steve","iPhone");
        m.put("Bill", "Windows10");
        System.out.println(m);
        System.out.println(m.get("Bill"));
        
        System.out.println();
        
        m.put("Bill", "Xbox");
        System.out.println(m);
        System.out.println(m.get("Bill"));
        
        System.out.println();
        
        Map<Integer, String> m2 = new HashMap<>();
        m2.put(100, "中正區");
        m2.put(103, "大同區");
        System.out.println(m2);
        System.out.println(m2.get(100));
    }
    
}
