
package pratice01;

import javax.swing.JOptionPane;

public class zodiac {

    public static void main(String[] args) {
       String year = JOptionPane.showInputDialog("輸入出生年");
       int yearInt = Integer.parseInt(year);
        
       switch (yearInt % 12){
           case 0: System.out.println("猴");break;
           case 1: System.out.println("雞");break;
           case 2: System.out.println("狗");break;
           case 3: System.out.println("豬");break;
           case 4: System.out.println("鼠");break;
           case 5: System.out.println("牛");break;
           case 6: System.out.println("虎");break;
           case 7: System.out.println("兔");break;
           case 8: System.out.println("龍");break;
           case 9: System.out.println("蛇");break;
           case 10: System.out.println("馬");break;
           case 11: System.out.println("羊");break;
           
       }
    }
    
}
