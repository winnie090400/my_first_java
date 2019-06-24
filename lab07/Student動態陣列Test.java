/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author User
 */
public class Student動態陣列Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student動態陣列 a;
        a = new Student動態陣列();
        a.setName("Tom");
        a.setScores(Student動態陣列.國文, 100);
        a.setScores(Student動態陣列.英文, 80);
        a.setScores(Student動態陣列.數學, 70);
        a.displayInfo();
    }
    
}
