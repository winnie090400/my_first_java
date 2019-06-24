
package lab11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Student {
    //物件的資料(屬性)
    private String name;
    private Map<String, Integer> scores;
    
        //建構子
    public Student(){
        name = "未設定";
        scores = new HashMap<>();
               
    }

    //setter設定值    
   
    public void setName(String name){
        if(name == null || name.length()<2){
            System.out.println("name不能為null或少於2個字");
            System.out.println("name" + name);
            return;
        }
        this.name = name;
    }
       
    public void setScores(String subject, int score){

        scores.put(subject, score);
    }
    
    
    public int getTotal(){
        int total=0;
        
        Collection<Integer> values;
        values = scores.values();
        
        for(Integer i:values){
            total += i;
        }
        
        return total;
    }
    
    public void displayInfo(){
       
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("  ");
        
        Set<String> subjects;
        subjects = scores.keySet(); 
        
        for(String s:subjects){
           sb.append(s).append("=").append(scores.get(s)).append("  ");        
           
        }
                
        int total = getTotal();
        sb.append("total").append("=").append(total);
        System.out.println(sb.toString());
    }
}
    