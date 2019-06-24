
package 工廠Model;

//工廠有個重點會返回我們想要的商品

public class Test1 {


    public static void main(String[] args) {
        Factory teeFac = new 供應商();
        Product tee = teeFac.getProduct();
        Product myTee = ((供應商) teeFac).getProduct("無糖的");
        
        tee.describe();    //一般綠茶
        myTee.describe();  //加糖綠茶
        
    }
    
}
