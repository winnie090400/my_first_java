
package lab02;


public class studentTest {

   
    public static void main(String[] args) {
        student a = new student();
        a.name = "Tom";
        a.eng = 20;
        a.math = 30;
        a.display();
        
        student b = new student();
        b.name = "Amy";
        b.eng = 50;
        b.math = 60;
        b.display();
    }
    
}
