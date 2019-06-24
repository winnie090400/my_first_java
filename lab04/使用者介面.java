
package lab04;

import javax.swing.JOptionPane;
public class 使用者介面 {
    String 選擇項目;
    火影忍者 a;
    大補丸 b;
    boolean 繼續執行 = true; //boolean 布林類型，值為 true / false
    
    //方法(method)
    public void 顯示選單(){
        // \n換行符號
        String s = "1.建立忍者\n"+
                   "2.修改忍者名字\n"+
                   "3.顯示忍者資訊\n"+
                   "4.建立大補丸\n"+
                   "5.輸入大補丸資訊\n"+
                   "6.顯示大補丸資訊\n"+
                   "7.吃大補丸\n"+
                   "8.分身\n"+
                   "9.結束程式";
        選擇項目 = JOptionPane.showInputDialog(s);
    }
    
    public void 建立忍者(){
        if(a==null){   //如果a為空(還沒參考到任何物件)
            a = new 火影忍者();
            String s;
            s = JOptionPane.showInputDialog("輸入忍者名字");
            a.名字 = s;
            JOptionPane.showMessageDialog(null, "忍者資訊輸入完成");
        }else{
            JOptionPane.showMessageDialog(null, "忍者已建立");
        }
    }
    
    public void 修改忍者名字(){
        if(a==null){   //如果a為空(還沒參考到任何物件)
            JOptionPane.showMessageDialog(null, "忍者尚未建立，無法執行「輸入忍者資訊」");
            return; //結數函數
        }else{
            String s;
            s = JOptionPane.showInputDialog("輸入忍者名字");
            a.名字 = s;
            JOptionPane.showMessageDialog(null, "忍者資訊輸入完成");        
        }
        
    }
    
    public void 顯示忍者資訊(){
        a.顯示資訊();
    }
    
    public void 建立大補丸(){
        if(b==null){   //如果b為空(還沒參考到任何物件)
            b = new 大補丸();
            JOptionPane.showMessageDialog(null, "大補丸建立成功");
        }else
            JOptionPane.showMessageDialog(null, "大補丸已建立");
    }
    
    public void 輸入大補丸資訊(){
        if(b==null){   
            JOptionPane.showMessageDialog(null, "大補丸尚未建立，無法執行「輸入大補丸資訊」");
            return; //結數函數
        }
        
        String s文字 = JOptionPane.showInputDialog("輸入大補丸資訊");
        int s = Integer.parseInt(s文字);
        b.x = s;
        JOptionPane.showMessageDialog(null, "大補丸資訊輸入完成");
   
    }
    
    public void 顯示大補丸資訊(){
        b.顯示大補丸資訊();
    }

    public void 吃大補丸(){
        a.吃(b);
    }
    
    
    public void 分身(){
        a.分身();
    }
    
    public void 結束程式(){
        繼續執行 = false;
    }
      
    
    
    public void 執行選項(){
        
        int option = Integer.parseInt(選擇項目); //文字轉int
        
        
            switch(選擇項目){
                case "1" : 建立忍者();break;
                case "2" : 修改忍者名字();break;
                case "3" : 顯示忍者資訊();break;
                case "4" : 建立大補丸();break;
                case "5" : 輸入大補丸資訊();break;
                case "6" : 顯示大補丸資訊();break;
                case "7" : 吃大補丸();break;
                case "8" : 分身();break;
                case "9" : 結束程式();break;
                case ""  : JOptionPane.showMessageDialog(null, "請輸入選項");break;
                default  : JOptionPane.showMessageDialog(null, "尚未支援");break;
            }

        
    }
    
        
             
    
    
    
    
}
