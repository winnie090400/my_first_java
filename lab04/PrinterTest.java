
package lab04;
//工程師C
public class PrinterTest {

    public static void main(String[] args) {
        Student a = new Student();
        a.firstName = "Tom";
        a.lastName = "Ccc";
        a.eng = 98;
        a.math = 90;
                
        Student b = new Student();
        b.firstName = "Amy";
        b.lastName = "Ddd";
        b.eng = 50;
        b.math = 99;
        
        Calculator ec = new Calculator();
        ec.title = "英文總分";
        ec.titleAverage = "英文平均";
        ec.add(a.eng); //若要輸出目前加總 sout(ec.add(a.eng));
        ec.add(b.eng);                            //b.eng
        
        Calculator mc = new Calculator();
        mc.title = "數學總分";
        mc.titleAverage = "數學平均";
        mc.add(a.math);
        mc.add(b.math);
        
        Printer p = new Printer();
        
        p.print(a); //將a參考的位置傳入
        p.print(b);
        p.printTotal(ec);
        p.printAverage(ec);
        p.printTotal(mc);
        p.printAverage(mc);
        
    }
    
}
