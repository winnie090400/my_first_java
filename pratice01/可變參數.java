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
public class 可變參數 {

    public static void test(String... args) {
        for(String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        test();//0个参数
        test("a");//1个参数
        test("a","b");//多个参数
        test(new String[] {"a", "b", "c"});//直接传递数组
    }
    
}
