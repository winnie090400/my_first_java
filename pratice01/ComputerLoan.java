/*
  主要練習: Math.pow() 函式回傳 base 的 exponent 次方（幂）值
 */
package pratice01;

import java.util.Scanner;

public class ComputerLoan {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("輸入年利率幾%");
        double 年利率 = input.nextDouble();
        double 月利率 = 年利率 / 1200.0;
                
        System.out.print("輸入償還的總年數");
        int 償還的總年數 = input.nextInt();
        
        System.out.println("輸入貸款總額");
        double 貸款總額 = input.nextDouble();
        
        double 月支付額 = (貸款總額 * 月利率) / (1 - (1 / Math.pow((1+月利率), 償還的總年數 * 12)));   //Math歸屬於java.lang package在開始就已經預設匯入 所以不需要額外匯入
        System.out.println("月支付總額: $" + Math.rint(月支付額*100)/100);
        
        double 總支付額 = 月支付額 * 償還的總年數 * 12;
        System.out.println("總支付額: $" + (int)(總支付額*100)/100.0);   //將數字轉為小數點兩碼
    }
    
}
