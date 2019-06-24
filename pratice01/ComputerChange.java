
package pratice01;


import java.util.Scanner;

public class ComputerChange {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter miles:");
        double miles = input.nextDouble();
        double x = Math.sqrt(3) / 4.0;
        double k = Math.pow(miles, 2) * x ;
        System.out.println(k);
    }
    
}
