
package lab03;

import javax.swing.JOptionPane;

public class player {
    String name;
    double cm;
    double kg;
    
    public void display(){
        double cmM = this.cm / 100;
        double bmi = this.kg / (cmM * cmM);
        
        
        System.out.print(this.name);
        System.out.print("\t");
        System.out.print(this.cm);
        System.out.print("\t");
        System.out.print(this.kg);
        System.out.print("\t");
        System.out.println(bmi);
    }
    
    public void input(){
        String name文字 = JOptionPane.showInputDialog("輸入名字");
        String cm文字 = JOptionPane.showInputDialog("輸入身高cm");
        String kg文字 = JOptionPane.showInputDialog("輸入體重kg");
        
        this.name = name文字;
        this.cm = Double.parseDouble(cm文字);
        this.kg = Double.parseDouble(kg文字);
    }
    
}
