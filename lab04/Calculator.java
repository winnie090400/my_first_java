
package lab04;


public class Calculator {
    String title;
    String titleAverage;
    int total = 0;
    int count = 0; //紀錄add執行次數
    
    public int add(int score){
        count +=1;
        total += score;
        return total;
    }
}
