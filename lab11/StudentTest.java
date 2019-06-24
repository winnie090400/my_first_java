
package lab11;


public class StudentTest {


    public static void main(String[] args) {
        Student a= new Student();
        a.setName("Tom");
        a.setScores("國文", 100);
        a.setScores("英文", 80);
        a.setScores("數學", 70);
        a.displayInfo();
        
        Student b= new Student();
        b.setName("Amy");
        b.setScores("國文", 70);
        b.setScores("英文", 80);
        b.setScores("數學", 90);
        b.displayInfo();

    }
    
}
