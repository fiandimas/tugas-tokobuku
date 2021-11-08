/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author Asus
 */
public class Database {
    
    public Connection connection() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop", "root", "");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
}
