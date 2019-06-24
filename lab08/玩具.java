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
public class 玩具 implements 可退貨的, 可顯示資料的{
    private String 名稱;
    private int 價格;

    public 玩具(String 名稱, int 價格) {
        this.名稱 = 名稱;
        this.價格 = 價格;
    }

    public void 顯示資料(){
        System.out.println("名稱\t" + 名稱);
        System.out.println("價格\t" + 價格);
                
    }
    
    
    @Override
    public String 退貨資訊() {
        return "玩具一日內可退貨";
    }
    
}
