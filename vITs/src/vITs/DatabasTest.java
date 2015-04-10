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
public class DatabasTest {
    
    public static void main(String[] argv) {
        try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://resadb.cnjxqasdqhys.us-west-2.rds.amazonaws.com:3306/resaDB", "resaDB", "resaDB1234");
        
        Statement myStmt = connection.createStatement();
        
        ResultSet myRs = myStmt.executeQuery("select * from Konsulter");
        
        while(myRs.next()) {
            System.out.println(myRs.getString("Email"));
                    }
        } catch (SQLException e) {
            System.out.print("Det blev fel");
            e.printStackTrace();
            return;
        } 
    }
    
}
