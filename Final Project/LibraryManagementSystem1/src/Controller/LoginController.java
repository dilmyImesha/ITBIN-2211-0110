
package Controller;

import View.Home;
import Model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.Login;
import java.awt.Frame;

/**
 *
 * @author Dilmi
 */

public class LoginController {
    public static void login(String usName, String pass) {
        String query = "SELECT * FROM login WHERE username = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
             
            pstmt.setString(1, usName);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String password = rs.getString("password");
                    if (password.equals(pass)) {
                        System.out.println("Login Successful");
                        for (Frame frame : Login.getFrames()) {
                            frame.dispose();
                        }
                        new Home().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid password", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
