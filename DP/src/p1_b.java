/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dev Padaliya
 */
import java.sql.*;

public class p1_b {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "");
        
       PreparedStatement pst = conn.prepareStatement("INSERT INTO emp(name, age, city) VALUES(?,?,?)"
);

        pst.setString(1, "Alice");
        pst.setInt(2, 20);
        pst.setString(3, "Rajkot");
        

        int colsAffect = pst.executeUpdate();
        System.out.println(colsAffect + " rows Affected");
        
        conn.close();
    }
}