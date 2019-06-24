
package lab04;


public class ShoppingCartTest {


    public static void main(String[] args) {
        Product p1 = new Product();
        p1.id = 111;
        p1.description = "蘋果";
        p1.price = 100;
        p1.color = 'R';
        
        Product p2 = new Product();
        p2.id = 222;
        p2.description = "藍莓";
        p2.price = 200;
        p2.color = 'B';
        
        Product p3 = new Product();
        p3.id = 333;
        p3.description = "芭樂";
        p3.price = 300;
        p3.color = 'G';
        
        ShoppingCart p = new ShoppingCart();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.displayTotal();
               
        
    }
    
}
