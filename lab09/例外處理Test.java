/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class 例外處理Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        帳戶輸入介面 a = new 帳戶輸入介面();
        
        String name = a.輸入名字();
        int balance = a.輸入金額();
        
        System.out.println(name);
        System.out.println(balance);
        
    }
    
}
