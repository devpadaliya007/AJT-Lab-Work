/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dev Padaliya
 */
package p2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class p2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "");
        CallableStatement ct = conn.prepareCall("call get_city(?, ?)");
        ct.setInt(1, 4);
        ct.registerOutParameter(2, Types.VARCHAR);
        
        ct.execute();

        String city = ct.getString(2);
        System.out.println(city);
    }
}
