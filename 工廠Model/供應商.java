/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 工廠Model;

/**
 *
 * @author User
 */
public class 供應商 implements Factory{
    //返回一般綠茶
    @Override   //繼承父類的方法(這裡例子供應商會繼承工廠的方法)
    public Product getProduct() {
        return new 綠茶();
    }
    
    //返回想要的狀態的綠茶
    public Product getProduct(String state){
        return new 綠茶(state);
    }
    
    
}
