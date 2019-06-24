/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 無法 new衣服 因為衣服為抽象物件
        襯衫 a = new 襯衫("紅襯衫", 1000, 'M', 'R');
        褲子 b = new 褲子("藍褲子", 2000, 'L', 'B', 'F');        
        內衣 c = new 內衣("性感的內衣", 5000, 'S', 'R');
        玩具 d = new 玩具("變型金剛", 10000);
        
       購物車 s = new 購物車();
       s.加入(a);
       s.加入(b);
       s.加入(c);
       s.顯示資料();
       
       退貨車 r = new 退貨車();
       r.加入(a);
       r.加入(b);
//       r.加入(c); 內衣無法退貨
       r.加入(d);
       r.顯示資料();
               
    }
    
}
