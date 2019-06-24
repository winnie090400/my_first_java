
public class Ex02_變數 {

    public static void main(String[] args) {
       byte eng = 100; //可以將byte改成double/float會自動視此運算為浮點運算
       byte math = 97;
        System.out.println(eng);
        System.out.println(math);
        System.out.println(eng + math);
        System.out.println((eng + math) / 2.0); //若變數未設定成浮點值，浮點數運算必須出現浮點數
        
    }
    
}
