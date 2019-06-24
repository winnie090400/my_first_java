 
package 工廠Model;

/**
 *
 * @author User
 */
public class 綠茶 implements Product{
    //預設綠茶加糖
    String state = "加糖";
    //預設的建構
    protected 綠茶(){}
    //代入狀態的建構
    protected 綠茶(String state){
        this.state = state;
    }
    
    @Override
    public void describe() {
        System.out.println("我是"+ state + "綠茶");
    }
}
