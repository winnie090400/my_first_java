/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */
public class 綜合應用Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("國文", 100);
        map.put("英文", 80);
        map.put("數學", 70);
        System.out.println("Map"+map);
        System.out.println();
        
        Set<String> keys;
        keys = map.keySet();
        System.out.println("Set"+keys);
        for(String s:keys){
            System.out.println(s);
        }
        System.out.println();
        
        Collection<Integer> values;
        values = map.values();
        System.out.println("Collection"+values);
        for(Integer i:values){
            System.out.println(i);
        }
    }
    
}
