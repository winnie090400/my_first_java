
package lab05;

import javax.swing.JOptionPane;
public class 電梯顯示介面 {
    //私有成員
    private 電梯資料 elevator;
    
    //Setter 用來設定欄位值的方法，因為其他類別無法直接使用私有成員
    public void setElevator(電梯資料 elevator){
        /*this 代表目前執行 setElevator()的物件
               通常省略不寫
               當欄位與區域變數同名，為了區別必須使用 this
        */
        this.elevator = elevator;
    }
    
    public String 顯示選單輸入(String s){
        String option = JOptionPane.showInputDialog(s);
        return option;
    }
    
    public void 顯示目前所在樓層(){
        String s = "目前在"+this.elevator.getFloor()+"樓";
        JOptionPane.showMessageDialog(null, s);
    }
    
    public void 顯示到達樓層(){
        String s = this.elevator.getFloor()+" 樓到了";
        JOptionPane.showMessageDialog(null, s);
    }
    
    public void 顯示指定訊息(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public String 電梯選單(String s){
        String eleOption = JOptionPane.showInputDialog(s);
        return eleOption;
    }

    
        
}


