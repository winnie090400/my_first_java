
import java.util.Scanner;


public class Ex04_BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入身高CM");
        double height = input.nextDouble();
        System.out.println("輸入體重KG");
        double weight = input.nextDouble();
        
        double heightM = height / 100.0;
        double BMI = weight / Math.pow(heightM, 2);
        
        System.out.print("身高cm: " + height);
        System.out.print("\t");
        System.out.println("體重kg: " + weight);
        System.out.print("BMI: " + (int)(BMI*10)/10.0);
        System.out.print("\t");
        if (BMI < 18.5)
            System.out.println("過輕");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI <30)
            System.out.println("過重");
        else
            System.out.println("肥胖");  
    }
    
}
