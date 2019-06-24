
package lab04;


public class 火影忍者 {
    String 名字;
    int 查克拉;
    
    public void 吃(大補丸 da){
        查克拉 += da.x;
        System.out.println("查克拉+ "+ da.x);
    }
    
    
    public void 分身(){
        if(查克拉>=10){
            System.out.println("分身!! 查克拉-10");
            查克拉 = 查克拉-10;
        }else
            System.out.println("查克拉不足 吃大補丸");
    }
    
    public void 顯示資訊(){
        System.out.println("-------------");
        System.out.println("名字"+名字);
        System.out.println("查克拉"+查克拉);
        System.out.println("");
        
    }
}
