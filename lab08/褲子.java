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
public class 褲子 extends 衣服 implements 可退貨的{

    private char 性別; //F=female M=Male

    public 褲子(String 名稱, int 價格, char 大小, char 顏色, char 性別) {
        super(名稱, 價格, 大小, 顏色);   //super() = 衣服 執行父類別建構子
        this.性別 = 性別;
    }

    @Override  //方法已存在從父類別繼承，並覆蓋父類別的方法
    public void 顯示資料() {
        super.顯示資料();  //執行父類別程式碼
        System.out.println("性別\t" + 性別);
    }

    @Override
    public String 退貨資訊() {
        return "褲子7日內退貨";
    }
}
