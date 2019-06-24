
import javax.swing.JOptionPane;

public class Test1 {
/*轉換公式： 
華氏 = 攝氏*(9/5)+32 
攝氏 = (華氏-32)*5/9
    */

    public static void main(String[] args) {
        String 攝氏 = JOptionPane.showInputDialog("輸入攝氏溫度");
        double C =Double.parseDouble(攝氏); //String轉double浮點數
        double 華氏 = C * (9.0/5.0) + 32;
        System.out.println(華氏);
    }
    
}
