
package lab03;


public class Ex01_測試字串相等性 {


    public static void main(String[] args) {
        String a = "JAVA";
        String b = "JAVA";
        System.out.println("a == b" + (a == b));
        
        String c = new String("JAVA");                     //新的字串
        System.out.println("a == c" + (a == c));
        
        System.out.println("a.eqaulus(c)" + a.equals(c));  //比較字串內容是否相同
        
        System.out.println("------------------------------");
        
        int x = 100;
        int y = 99;
        
        String s1 = "JAVA";
        String s2 = s1 + x + y; //簡寫
        
        //實際的字串相加是由StringBuilder + append產生的
        StringBuilder sb = new StringBuilder();
        String s3 = sb.append("JAVA").append(x).append(y).toString();
        
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(sb);
       
        
    }
}

    
