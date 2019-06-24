
package lab02;

import javax.swing.JOptionPane;

public class student {
    //宣告欄未變數(定義student表格有幾個欄位)
    String name;
    int eng;
    int math;
    
    //設計函數，Java稱為方法(method)
    public void display(){
        int total;
        total = this.eng + this.math;
        
        double avg;
        avg = total / 2D;
        
        //print()輸入資料後停在同一行
        //\t代表TAB空白
        //ln 代表換行
        System.out.print(this.name);
        System.out.print("\t");
        System.out.print(this.eng);
        System.out.print("\t");
        System.out.print(this.math);
        System.out.print("\t");
        System.out.print(total);
        System.out.print("\t");
        System.out.println(avg);
    }
    
    public void input(){
        String name文字;
        name文字 = JOptionPane.showInputDialog("請輸入名字");
        
        String eng文字;
        eng文字 = JOptionPane.showInputDialog("請輸入英文成績");
        
        String math文字;
        math文字 = JOptionPane.showInputDialog("請輸入數學成績");
        
        //將資料填入物件
        this.name = name文字;
        this.eng = Integer.parseInt(eng文字);
        this.math = Integer.parseInt(math文字);
        
        
    }
}
