import javax.swing.JOptionPane;

public class Test2 {


    public static void main(String[] args) {
        
        String height = JOptionPane.showInputDialog("輸入身高cm");
        String weight = JOptionPane.showInputDialog("輸入體重kg");
        
        double heightM = Double.parseDouble(height) / 100;
        double BMI = Double.parseDouble(weight) / (heightM*heightM);
        
        System.out.println("身高cm" + height);
        System.out.println("體重kg" + weight);
        System.out.println("BMI" + (int)(BMI*100)/100.0);
    }
    
}
