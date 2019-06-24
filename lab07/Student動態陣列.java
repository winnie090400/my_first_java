/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Student動態陣列 {
    //物件的資料(屬性)
    private String name;
    private ArrayList<String> subjects;
    private ArrayList<Integer> scores;
    
    //static 靜態資料(不屬於物件，可直接使用)
    //final 常數(無法再用 = 指定新值)
    public final static String 國文 = "國文";
    public final static String 英文 = "英文";
    public final static String 數學 = "數學";
    
    //建構子
    public Student動態陣列(){
        name = "未設定";
        scores = new ArrayList();
        scores.add(0);
        scores.add(0);
        scores.add(0);
        subjects = new ArrayList();
        subjects.add(國文);
        subjects.add(英文);
        subjects.add(數學);
        
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
        int index = subject.indexOf(subject);  //查詢subject在陣列第幾項
        if(index < 0){
            System.out.println("查無科目名稱 " + subject);
            return;
        }
        scores.set(index, score);
    }
    
    
    //Getter取值
    public int getTotal(){
        int total =0;
        
        for(int score:scores){
            total += score;        //累加
        }
        return total;
    }

    public void displayInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("  ");
        
        for(int i =0; i<subjects.size(); i++){
            String subject = subjects.get(i);
            int score = scores.get(i);
            sb.append(subject).append("=").append(score).append("  ");
        }
        
        int total = getTotal();
        sb.append("total").append("=").append(total);
        System.out.println(sb.toString());
    }

    
}
