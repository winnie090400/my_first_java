
package lab05;


public class 電梯控制器 {
    private 電梯資料 moudel;
    private 電梯資料 電梯1;
    private 電梯資料 電梯2;
    private 電梯顯示介面 view;
    private String option;
    
    public void 初始化(){
        option = "";
        電梯1 = new 電梯資料();
        電梯2 = new 電梯資料();
        moudel = 電梯1;
        view = new 電梯顯示介面();
        view.setElevator(moudel);
        view.顯示指定訊息("初始化完成");
    }
    
    private void 執行選單(){
        String s = "0. 顯示目前使用電梯\n"+
                   "1. 顯示目前樓層\n"+
                   "2. 向上一樓\n"+
                   "3. 向下一樓\n"+
                   "4. 直達頂樓\n"+
                   "5. 切換電梯\n"+ 
                   "9. 結束";
        option = view.顯示選單輸入(s);
    }
       
    private void 執行電梯選單(){
        String s = "1. 電梯1\n"+
                   "2. 電梯2\n";
        option = view.顯示選單輸入(s);
        
        switch(option){
            case "1": moudel = 電梯1;
                      view.setElevator(電梯1);
                      break;
            case "2": moudel = 電梯2;
                      view.setElevator(電梯2);
                      break;
            case "9": break;
            default: view.顯示指定訊息("尚未支援");break;
        }

    }
    
    
    private void 執行選項(){
        switch(option){
            case "0": if(moudel == 電梯1){
                            view.顯示指定訊息("電梯1使用中");
                        }else if(moudel == 電梯2){
                            view.顯示指定訊息("電梯2使用中");
                        }
                      break;
            case "1": view.顯示指定訊息("電梯在 "+moudel.getFloor()+" 樓");break;
            case "2": view.顯示指定訊息("電梯向上");
                      moudel.樓層加1();
                      view.顯示到達樓層();
                      break;
            case "3": view.顯示指定訊息("電梯向下");
                      moudel.樓層減1();
                      view.顯示到達樓層();
                      break;
            case "4": view.顯示指定訊息("電梯直達頂樓");
                      moudel.樓層頂樓();
                      view.顯示到達樓層();
                      break;
            case "5": 執行電梯選單();
                      if(moudel == 電梯1){
                            view.顯示指定訊息("電梯1使用中");
                        }else if(moudel == 電梯2){
                            view.顯示指定訊息("電梯2使用中");
                        }
                      break;
            case "9": break;
            default: view.顯示指定訊息("尚未支援");break;
        }
    }
    
    
    private boolean 是否繼續(){
        return !option.equals("9"); //當選項不是9
    }
    
    public void 啟動(){
        初始化();
        while(是否繼續()){
            執行選單();
            執行選項();             
        }
        
    }

    
}
