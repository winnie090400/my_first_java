/* 有些方法拋出的例外，編譯器會檢查程式是否處理
(Exception子類，但不包含RuntimeException子類)
RuntimeException屬於非受檢例外，代表程式有bug，不建議補捉，應該修正程式Bug
*/
package lab07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Test_字串轉日期 {

    
    public static void main(String[] args) throws ParseException {
        //日期化格式
        String fmt = "yyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        
        
        //輸入日期
        String str = JOptionPane.showInputDialog("請輸入日期，格是必須為 "+fmt);
        
//        String 轉 Date
        try{
            Date d = sdf.parse(str);  //受檢例外(編譯器會檢查是否有做例外處理)
            JOptionPane.showMessageDialog(null, "日期物件 = "+ d.toString());
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "轉換失敗，日期格式錯誤: "+str);
        }  
        
    }
    
}
