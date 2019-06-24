
package 銀行;


public class 銀行控制器 {
    private 銀行資料 acc;
    private 銀行資料 acc1;
    private 銀行資料 acc2;
    private 銀行顯示介面 view;
    private String option;
    private String accOption;
    
    public void 啟動(){
        //!代表NOT運算，將布林值反向!true -->false 
        view = new 銀行顯示介面();
        option = "";
        while(!option.equals("9")){
            選單();
            執行選項();
        }
    }
    
    private void 選單(){
        String s = "1.建立客戶與帳戶\n"+
                   "2.選擇操作帳戶\n"+
                   "3.顯示客戶帳戶資訊\n"+
                   "4.存款\n"+
                   "5.提款\n"+
                   "6.轉帳\n"+
                   "9.結束";
        
        do{
            option = view.顯示選單輸入(s);
            if (option == null){
                view.顯示指定訊息("請輸入9來結束");
            }
        }while (option == null); //當選項為空時循環
    }

    private void 執行選項(){
        //String t = null;
        switch(option){
            case "1":
                if(acc == null){
                    acc1 = new 銀行資料();
                    acc2 = new 銀行資料();
                    acc = acc1;
                    view.setAcc(acc);
                    acc1.setName(view.顯示名字輸入());
                    acc2.setName(acc1.getName());
                    view.顯示指定訊息("帳戶已建立 , 目前使用 acc1");
                }else{
                    view.顯示指定訊息("客戶資料已建立");
                }
                break;
            case "2":
                if(acc == null){
                    view.顯示指定訊息("客戶資料尚未建立");
                }
                
                String s = "選擇操作帳戶\n"+
                           "1. account 1\n"+
                           "2. account 2\n";
                accOption = view.顯示選單輸入(s);

               switch (accOption) {
                    case "1":
                        acc = acc1;
                        view.setAcc(acc1);
                        view.顯示指定訊息("目前操作帳戶 account1");
                        break;
                    case "2":
                        acc = acc2;
                        view.setAcc(acc2);
                        view.顯示指定訊息("目前操作帳戶 account2");
                        break;
                    default:
                        view.顯示指定訊息("操作失敗");
                        break;
                }
                break;
            case "3":
                if(acc == null){
                    view.顯示指定訊息("客戶資料尚未建立");
                }
                
                String msg = this.acc.getId() + "\n"+
                           acc.getName() + "\n"+
                           "acc1餘額 $" + acc1.getBalance() + "\n"+
                           "acc2餘額 $" + acc2.getBalance() + "\n";
                view.顯示指定訊息(msg);
                break;
            case "4":
                if(acc == null){
                    view.顯示指定訊息("客戶資料尚未建立");
                }
                
                String deposite = view.顯示金額輸入();
                long d = Long.parseLong(deposite);
                acc.存款(d);
           
                view.顯示指定訊息("存款成功！"+"\n"+ "存款金額 $"+ deposite +" 存款餘額為 $" + acc.getBalance());
                break;
 
            case "5":
                if (acc == null){
                    view.顯示指定訊息("客戶資料尚未建立");
                }
                
                String withdraw = view.顯示金額輸入();
                long w = Long.parseLong(withdraw);
                acc.提款(w);
                view.顯示指定訊息("提款成功！"+"\n"+ "提款金額 $"+ withdraw +" 存款餘額為 $" + acc.getBalance());
                break;
                
            case "6":
                if (acc == null){
                    view.顯示指定訊息("客戶資料尚未建立");
                }else if(acc == acc1){
                   view.顯示指定訊息("acc1轉帳至acc2");
                   String transfer = view.顯示金額輸入();
                   long t = Long.parseLong(transfer);
                   if(acc.getBalance() < t){
                        view.顯示指定訊息("餘額不足，轉帳失敗");
                        return;
                   }else{
                        acc.提款(t);
                        acc2.存款(t);
                        view.顯示指定訊息("轉帳成功！"+"\n"+ "轉帳金額 $"+ transfer +"\n"+"acc1餘額 $" + acc.getBalance()+"\n"+"acc2餘額 $" + acc2.getBalance());
                        }
                }else if(acc == acc2){
                   view.顯示指定訊息("acc2轉帳至acc1");
                   String transfer = view.顯示金額輸入();
                   long t = Long.parseLong(transfer);
                   if(acc.getBalance() < t){
                        view.顯示指定訊息("餘額不足，轉帳失敗");
                        return;
                   }else{
                   acc.提款(t);
                   acc1.存款(t);
                   view.顯示指定訊息("轉帳成功！"+"\n"+ "轉帳金額 $"+ transfer +"\n"+"acc1餘額 $" + acc1.getBalance()+"\n"+"acc2餘額 $" + acc.getBalance());
                   }
                }
                break;
                
            case "9": break;
            
            default: view.顯示指定訊息("尚未支援");break;
        }
    }

}
