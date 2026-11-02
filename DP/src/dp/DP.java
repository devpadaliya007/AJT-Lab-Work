/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dp;
import java.sql.*;
/**
 *
 * @author Dev Padaliya
 */
public class DP {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "");
        
        PreparedStatement pst = conn.prepareStatement("INSERT INTO emp (name, city, age) VALUES (?,?,?)");
        
        
        pst.setString(1, "ABC");
        pst.setString(2, "India");
         pst.setInt(3, 22);

        int colsAffect = pst.executeUpdate();
        System.out.println(colsAffect + " rows Affected");
        
        conn.close();
    }
}
    

