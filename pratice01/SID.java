
package pratice01;

import javax.swing.JOptionPane;


public class SID {


    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("輸入身分證");
        pretest test = new pretest();
        test.show(id);
    }

    static class pretest {
        String id;
        void show(String id) {
            this.id = id;
            if(!id.matches("[A-Z]\\d{9}")){
                System.out.println("格式錯誤，格式為大寫英文及9位數字!!");
            }else if(this.checkID(id) ! = 0){
                System.out.println("ID驗證通過!");
            }else{
                System.out.println("ID驗證失敗!");
            }
            
        }
        int checkID(String id){
            id.toUpperCase();
            char first = id.charAt(0);  //取出第一個字母
            
            //A-Z的對應數字
            int idum[] = {10,11,12,13,14,15,16,17,34,18,19,20,21
 ,22,35,23,24,25,26,27,28,29,32,30,31,33};
            
           /*轉成11碼的字串,'A'=65； substring:從index:1開始取String*/
          id = idum[first-'A']+id.substring(1);
          /*把第一碼放到sum中,'0'=48*/
          int sum = id.charAt(0)-'0';
          
          /*取2-10的總合*/
          for(int i=1;i<10;i++){
              sum += id.charAt(i*(10-i));
          }
          
          /*10-加總的尾數 = 第11碼*/
          int checksum = (10-(sum%10))%10;
          if(checksum == id.charAt(10)-'0')
          return 0;
          else
          return 1;
              
          

        }
    }
    
}
