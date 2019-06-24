
package lab12;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;


public class SQLInjectionTest {


    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby://localhost:1527/EmployeeDB";
        String user = "test";
        String pass = "tiger";
        //SQL Injection(隱碼攻擊)
        //輸入 '1' OR '1'='1'
        String inputFirstName = JOptionPane.showInputDialog("請輸入要查詢的員工 first name");
        //select * from employee where firstname ='xxx'
        String query = "select * from employee where firstname=?";  //使用問號ˇ代表參數，之後設定
        System.out.println("query = "+query);
        
        try(Connection con = DriverManager.getConnection(url,user,pass);
            /*Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);*/
            PreparedStatement pstmt = con.prepareStatement(query);){   //使用prepareStatement避免隱碼攻擊 
            pstmt.setString(1, inputFirstName);
            ResultSet rs = pstmt.executeQuery();
            int count = 0; //記錄找到幾筆資料
            while(rs.next()){  
                count++;
                int id = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                java.util.Date birthdate = rs.getDate("birthday");
                float salary = rs.getFloat("salary");
                //格式化字串  %整數  %s字串  -靠左對齊  數字 寬度幾個字
                String s = String.format("%d \t %-20s %s %15s",
                        id,
                        firstName+" "+lastName,
                        birthdate,
                        NumberFormat.getCurrencyInstance(Locale.US).format(salary));
                System.out.println(s);
            }
            if(count == 0){
                System.out.println("查無此人");
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
          
    }
    
}
