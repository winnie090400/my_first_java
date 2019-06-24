/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;


public class Product {
    int id;
    String description;
    int price;
    char color;
    
    public String toString(){
     String s = id + "\t" + description + "\t" + price + "\t";
     if (color == 'R')
         s += "紅色";
     else if(color == 'B')
         s+= "藍色";
     else if(color == 'G')
         s+= "綠色";
     else if(color == 'U')
         s+= "未定";
     return s;
                 
    }


}
