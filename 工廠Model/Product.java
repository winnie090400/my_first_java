/*
 工廠方法模式( Factory Method )，定義一個用於建立物品的介面，
 讓子類決定實體化哪一個類別。工廠方法使一個類別的實例化延遲到其子類別。
 */
package 工廠Model;


public interface Product {
    //固定處理的事情封裝進入介面
    public void describe();
}
