/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice01;

/**
 *
 * @author User
 */
public class game123 {
    
    public static void main(String[] args) {
    
    //九九乘法
    for(int i = 1 ; i< 10 ; i++){
        for(int j = 1 ; j <10 ; j++)
        System.out.print(""+i+"*"+j+"="+(i*j)+"\t");
        System.out.println();
    }
    
    //1~100總和
    int M=0;
    for(int i=1; i<100; i++){
        M+=i;
        
    }
    System.out.println(M);
    
    //1~100 3的倍數總和
    int sum=0;
    for(int i=0; i<100;i++){
        if(i%3 == 0){
            sum+=i;
        }
    }
        System.out.println(sum);
    
    //列出5的倍數    
    for(int i=0; i<101;i++){
        if(i%5 == 0){
            System.out.print(i+"\t");
        }
    }

    }
    
}
