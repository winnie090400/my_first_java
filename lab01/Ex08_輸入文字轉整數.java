
import javax.swing.JOptionPane;

public class Ex08_輸入文字轉整數 {

    
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("輸入名字"); //跳出輸入視窗，且把輸入資料轉存為文字變數a
        System.out.println("你的名字是:" + a); 
        
        String e文字;
        e文字 = JOptionPane.showInputDialog("請輸入英文成績");
        
        String m文字;
        m文字 = JOptionPane.showInputDialog("請輸入數學成績");
        //String轉int
        int e;
        e = Integer.parseInt(e文字);
        int m;
        m = Integer.parseInt(m文字);
        int t;
        t = e + m;
        System.out.println("英文" + e);
        System.out.println("數學" + m);
        System.out.println("總分" + t);
        
        //文字轉浮點數
        String cm文字 = JOptionPane.showInputDialog("請輸入身高(cm)");
        
        double cm;
        cm = Double.parseDouble(cm文字); //String轉double
        System.out.println(cm);
        
    }
    
}
