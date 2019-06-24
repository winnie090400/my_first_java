/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class 產品查詢Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        產品 p1 = new 產品("A01","iPhone",20_000);
        產品 p2 = new 產品("A02","HTC", 30_000);
        產品 p3 = new 產品("A03","ASUS",40_000);
        
        Map<String, 產品> map = new HashMap();
        map.put("A01",p1);  //key,value
        map.put("A02",p2);
        map.put("A03",p3);
        
        String id = JOptionPane.showInputDialog("請輸入id來查詢");
        產品 p = map.get(id);   //不需要轉型(產品) map.get(id)
        if(p == null){
            JOptionPane.showMessageDialog(null, "查無此產品編號\n"+id);
        }else{
            JOptionPane.showMessageDialog(null, p);
        }
    }
    
}
