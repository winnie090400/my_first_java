/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author User
 */
public class 產品 {
    private String id;
    private String 名稱;
    private int 價格;
    
    //建構子
    public 產品(String id, String 名稱, int 價格){
        this.id = id;
        this.名稱 = 名稱;
        this.價格 = 價格;
    }
    
    @Override
    public String toString(){
        return "編號"+id+"\n名稱"+名稱+"\n價格"+價格;
    }
    
    
}
