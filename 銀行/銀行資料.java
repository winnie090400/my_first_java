
package 銀行;

public class 銀行資料 {
    private long balance = 1000;
    private String guest;
    private int id = 1;
    private 銀行顯示介面 view;
    
    public long getBalance(){
        return balance;
    }
    
    public void setName(String name){
        guest = name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return guest;
    }
    
    public void 存款(long deposite){
        if(deposite <= 0){
            view.顯示指定訊息("存款失敗，金額必須>0");
        }
        balance += deposite;       
    }
    
    public void 提款(long withdraw){
        if(withdraw <= 0){
            view.顯示指定訊息("提款失敗，金額必須>0");
        }else if(balance < withdraw){
            view.顯示指定訊息("餘額不足");
        }else{
            balance -= withdraw;
        }       
        
    }

}
