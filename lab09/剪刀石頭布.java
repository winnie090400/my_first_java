/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class 剪刀石頭布 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        String[] hands = {"剪刀", "石頭", "布"};
        
        int comp = rand.nextInt(3);
        
        int user;
        
        while (true) {            
            
         String option =JOptionPane.showInputDialog("0.剪刀\n"+"1.石頭\n"+"2.布");
//        for(int i = 0; i<3; i++){
//            System.out.printf("(%d)%s", i , hands[i]);
//            System.out.print(":");
//        }

//        user = stdIn.nextInt();
        user = Integer.parseInt(option);   
        String msg = "你出"+hands[user]+",電腦出"+hands[comp];
        
        if (user == comp){
            JOptionPane.showMessageDialog(null, msg +"\n"+"平手");
        }else if(user == 1 && comp == 0 || user == 2 && comp == 1 || user == 0 && comp == 2){
            JOptionPane.showMessageDialog(null, msg +"\n"+"你贏了");
        }else{
            JOptionPane.showMessageDialog(null, msg +"\n"+"你輸了");
        }
        
    
        }
        
        
    }
    
}
