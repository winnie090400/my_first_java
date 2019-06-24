
package 銀行;

import javax.swing.JOptionPane;

public class 銀行顯示介面 {
    private 銀行資料 acc;

    
    public void setAcc(銀行資料 acc){
        this.acc = acc;

    }
    
    public void 顯示指定訊息(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    public String 顯示選單輸入(String s) {
        String option = JOptionPane.showInputDialog(s);
        return option;
    }
    
    public String 顯示名字輸入(){
        String g = JOptionPane.showInputDialog("建立客戶名稱");
        return g;
        
    }

    public String 顯示金額輸入() {
        String money = JOptionPane.showInputDialog("輸入金額");
        return money;
        
    }

}
