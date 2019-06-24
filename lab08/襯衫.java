
package lab08;

//extends繼承父類別
public class 襯衫 extends 衣服 implements 可退貨的{
    
    public 襯衫(String 名稱, int 價格, char 大小, char 顏色) {
        super(名稱, 價格, 大小, 顏色);
    }

    @Override
    public String 退貨資訊() {
        return "襯衫3日內可退貨";
        
    }   
    
}
