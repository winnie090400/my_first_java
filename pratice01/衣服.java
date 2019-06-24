
package pratice01;
//抽象類別(禁止建立物件)
//設計衣服階層(繼承體系)，將重複使用的程式碼寫在父類別

import lab08.*;


public abstract class 衣服 {
    //屬性可指定預設值
    private int id;
    private static int 數量; //static 靜態資料一份物件共享 靜態資料獨立於物件之外
    private String 名稱;
    private int 價格;
    private char 大小;  //L,M,S
    private char 顏色;  //R=red, G=green, B=blue
    
    //建構子(初直設定)
    //Constructor
    public 衣服(String 名稱, int 價格, char 大小, char 顏色) {
        this.名稱 = 名稱;
        this.價格 = 價格;
        this.大小 = 大小;
        this.顏色 = 顏色;
        this.計算id();     //id 計算得來
    }
    
     public void 計算id(){
        數量 += 1;
        id = 數量;
    }
     
    //Getter
    public int getId() {
        return id;
    }

    public static int get數量() {
        return 數量;
    }

    public String get名稱() {
        return 名稱;
    }

    public int get價格() {
        return 價格;
    }

    public char get大小() {
        return 大小;
    }

    public char get顏色() {
        return 顏色;
    }
   
   
    public void 顯示資料(){
        // \t TAB定位點(間距8)
        System.out.println("id\t" + id);
        System.out.println("名稱\t" + 名稱);
        System.out.println("價格\t" + 價格);
        System.out.println("大小\t" + 大小);
        System.out.println("顏色\t" + 顏色);
    }
}
