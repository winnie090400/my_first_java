
package lab12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;


public class JDBCTest3_Insert {


    public static void main(String[] args) {
        //日期格式化
        Calendar calendar = Calendar.getInstance();
        calendar.set(1980,4,1);
        Date birthDate = calendar.getTime();  //java.util.Date
        
        //建立員工物件
        Employee e = new Employee(901, "曉明", "王", birthDate, 50_000);
        
        //準備連線資料庫所需的字串
        String url = "jdbc:derby://localhost:1527/EmployeeDB";
        String user = "test";
        String pass = "tiger";
        String query = "insert into employee values(?,?,?,?,?)"; //使用問號代表參數，之後設定
        
        try(Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement pstmt = con.prepareStatement(query);){
            //設定各項?參數值
            pstmt.setInt(1, e.getId()); 
            pstmt.setString(2, e.getFirstName());
            pstmt.setString(3, e.getLastName());
            
            //資料庫所使用的日期是 java.sql.Date,所以必須先將 java.util.Date轉換成java.sql.Date
            Date date = e.getBirthDate();
            long time = date.getTime();
            java.sql.Date sqlDate = new java.sql.Date(time);
            pstmt.setDate(4, sqlDate);
            pstmt.setFloat(5, e.getSalary());
            //executeUpdate()  回傳有幾筆資料更新完成
            if(pstmt.executeUpdate() == 1){
                System.out.println(e.getFirstName() + " 新增 成功");
            }else{
                System.out.println(e.getFirstName() + " 新增 失敗");
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
