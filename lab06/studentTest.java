/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author User
 */
public class studentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student a;
        a = new student();
        a.setName("Tom");
        a.setScores(0, 100);
        a.setScores(1, 80);
        a.setScores(2, 70);
        
        student b;
        b = new student();
        b.setName("Amy");
        b.setScores(0, 90);
        b.setScores(1, 80);
        b.setScores(2, 70);
        
        a.displayInfo();
        b.displayInfo();
    }
    
}
