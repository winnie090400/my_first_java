
public class Ex01_數字資料 {


    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(3L); //
        System.out.println(3.14F);  //F代表浮點float (32bit)
        System.out.println(3.14D); //D代表double (64 bit)
        System.out.println(0.1F == 0.1D); //答案為F 因為浮點數二次元進位無法精準表示0.1
        System.out.println(0.5F == 0.5D); //答案為T 因為浮點數二次元進位無法精準表示0.5
        System.out.println(3.0E2); //3.0 x 10^2
        
    }
    
}
