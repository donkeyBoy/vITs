/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vITs;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Matus
 */
public class Inlogg {

    Connection conn = DatabasTest.newConnection();
    
    
    public Inlogg(){
    
    }
    
    public String login(String username, String losen) {
        try {
            Statement myStmt = conn.createStatement();
            String sql = "Select Losenord from Konsulter where Anvandarnamn='" + username + "'";
            ResultSet rs = myStmt.executeQuery(sql);
            if (rs.next()) {
                String tryLosen = rs.getString(1);
                if (losen.equals(tryLosen)) {
                    sql = "Select ID from Konsulter where Anvandarnamn='" + username + "'";
                    rs = myStmt.executeQuery(sql);
                    rs.next();
                    return rs.getString(1);
                }
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean chef(String id) {
        try {
            Statement myStmt = conn.createStatement();
            String sql = "Select * from Chefer where ID=" + id;
            ResultSet rs = myStmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

}
