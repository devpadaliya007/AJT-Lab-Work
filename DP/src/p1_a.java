/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dev Padaliya
 */
import java.sql.*;

public class p1_a {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM emp");

          while (rs.next()) {
            System.out.println("name = " + rs.getString(2)
                    + ", age = " + rs.getString(3)
                    + ", city = " + rs.getString(4));
        }

        conn.close();
    }
}
