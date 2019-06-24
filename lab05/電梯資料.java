
package lab05;

public class 電梯資料 {
          
    //私有成員，其他類別無法看到
    private int floor=1;           //目前所在樓層
    public final int MAX_FLOOR=5;  //final自訂常數為某固定值
    public final int MIN_FLOOR=1;
    
    //Getter 用來取得值的方法
    public int getFloor(){
        return floor;
    }
    
    public void 樓層加1(){
        if(floor < MAX_FLOOR){
            floor++;
        }
    }
    
    public void 樓層減1(){
        if(floor > MIN_FLOOR){
            floor--;
        }
    }
    
    public void 樓層頂樓(){
        floor = MAX_FLOOR;
    }
    
}
