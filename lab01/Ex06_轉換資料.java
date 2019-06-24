
public class Ex06_轉換資料 {

    public static void main(String[] args) {
        byte a = 100;
        byte b = 50;
        int c = a + b; //32-bit運算
        System.out.println(c);
        byte d = (byte)(a+b); //32-bit 運算結果轉換8-bit
        System.out.println(d);
        //float 32-bit轉 int 32-bit
        double f = 3.14;
        int i = (int)f;
        System.out.println(i);
        
        System.out.println(5/3); //整數運算
        System.out.println(5%3); //餘數計算
        System.out.println(5.0D/3); //浮點運算
        System.out.println(5.0F/3);
        
        
    }
    
}
