
package lab12;

import java.sql.Statement;  //注意必須是java.sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Test1 {
    //注意
    //  1.Service 視窗必須啟動資料庫服務Database->JavaDB->Start Server
    //  2.專案程式庫必須加入資料庫區動程式
   
    public static void main(String[] args) {
        
        String url = "jdbc:derby://localhost:1527/EmployeeDB";
        String user = "test";
        String pass = "tiger";

//連接SQL資料庫登入，SQL的預設port是1433
//        String url = "jdbc:sqlserver://localhost:1433;databaseName=EmployeeDB;";
//        String user = "sa";
//        String pass = "12345";

//連接JavaApp預設資料庫登入            
//        Connection con = null;
//        Statement stmt = null;
//        ResultSet rs = null;
    
        //自動關閉寫法，簡化close()
        try(Connection con = DriverManager.getConnection(url,user,pass);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from employee")){
            //建立連線物件
                //con = DriverManager.getConnection(url,user,pass);
            //建立SQL陳述句物件
                //stmt = con.createStatement();
            //撰寫SQL查詢字串
                //String query = "select * from employee";
            //執行SQL查詢，獲取結果集(ResultSet)
                //rs = stmt.executeQuery(query);
            //逐筆讀取所查詢結果
            while(rs.next()){  //取得下一筆資料，若有獲取到資料回傳 true
                //讀取目前這筆資料的各項欄位
                int id = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                java.util.Date birthdate = rs.getDate("birthday");
                float salary = rs.getFloat("salary");
                //輸出員工資料
                System.out.println(id+" "+firstName+" "+lastName+" "+birthdate+" "+salary);
            }
        }catch(SQLException e){
                System.err.println(e);
        }//finally{   try區塊無論是否發生意外，最後一定會執行   關閉資源並捕捉關閉資源所發生的例外

//            try {if( rs != null) rs.close();} catch (SQLException ex) {System.err.println(ex);}
//            try {if( stmt != null) stmt.close();} catch (SQLException ex) {System.err.println(ex);}
//            try {if( con != null) con.close();} catch (SQLException ex) {System.err.println(ex);}
//        }
    }  
}
