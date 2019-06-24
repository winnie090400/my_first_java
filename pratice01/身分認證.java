/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class 身分認證 {

//   測試 testString 中是否包含了 123
    public static void main(String[] args) {
        String testString = "fewfeewffew4512361";
        System.out.println("String.contains():\t"+testString.contains("123"));
//    測試手機號碼格式    
        String testString3 = "0937-123456, 02-12345678, 0902-123456, 03-12345678";
        Pattern pattern = Pattern.compile("\\d{4}-\\d{6}");
        Matcher matcher = pattern.matcher(testString3);
        while(matcher.find()){
            System.out.println("matcher.group():\t"+matcher.group());
        }
        
        String line = "我的Line是帥過頭，手機0937123456，我的gmail是123456@gmail.com";
        Pattern r = pattern.compile("(\\D*)(\\d+)(.*)");
        Matcher m = r.matcher(line);
        if(m.find( )){
            System.out.println("Found value: "+m.group(0));
            System.out.println("Found value: "+m.group(1));
            System.out.println("Found value: "+m.group(2));
            System.out.println("Found value: "+m.group(3));
        }else{
            System.out.println("No match!");
                    
        }
        
        
    
    }
    
}
