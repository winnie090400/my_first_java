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
public class 帳戶輸入介面 {
    
    public String 輸入名字(){
        String name;
        while(true){
            name = JOptionPane.showInputDialog("請輸入名字");
            if(name == null || name.length() < 2){
                System.out.println("名字需大於2個字");
            }else{
                break; //跳出迴圈
            }
        }
        return name;
    }    
    
    public int 輸入金額(){
        int balance = 0;  //必須宣告初始值
        while(true){
            String s = JOptionPane.showInputDialog("輸入帳戶餘額");
        
            try{
                balance = Integer.parseInt(s);
                break;
            } catch(NumberFormatException e){
                System.out.println("數字格式有問題"+s);
            }
        }
        return balance;
    }
}
