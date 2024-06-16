/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dilmi
 */

public class RegisterModel {
    private Connection con;

    public RegisterModel() {
        con = DBConnection.getConnection();
    }

    public void addStudent(String userName, String password) throws SQLException {
        PreparedStatement pst = con.prepareStatement("INSERT INTO login (Username, Password) VALUES (?, ?)");
        pst.setString(1, userName);
        pst.setString(2, password);
        pst.executeUpdate();
    }
}
