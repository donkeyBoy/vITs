/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vITs;

import java.sql.*;

/**
 *
 * @author Matus
 */
public class UpdateClass {
    
    public static void main(String[] argv) {
        try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://resadb.cnjxqasdqhys.us-west-2.rds.amazonaws.com:3306/resaDB", "resaDB", "resaDB1234");
                
                Statement myStmt = connection.createStatement();
                
                String sql = "Delete from Lander where Land = 'Luxemburg'";
                
                myStmt.executeUpdate(sql);
        } catch (SQLException se) {
            se.printStackTrace();
        } 
    }
    
}
