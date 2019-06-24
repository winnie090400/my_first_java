
package pratice01;

import java.util.Scanner;


public class Lottery {

  
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("輸入兩位數樂透號碼");
        
        int lo1 = lottery / 10;
        int lo2 = lottery % 10;
        
        int gu = input.nextInt();
        int gu1 = gu/10;
        int gu2 = gu%10;
        
        
        System.out.println("樂透號" + lottery);
        if (lo1==gu1 && lo2==gu2)
            System.out.println("頭獎100000元");
        else if(lo1==gu2 && lo2==gu1)
            System.out.println("二獎3000元");
        else if(lo1==gu1||
                lo1==gu2||
                lo2==gu1||
                lo2==gu2)
            System.out.println("三獎1000元");
        else
            System.out.println("吃自己!");        
    }
    
}
