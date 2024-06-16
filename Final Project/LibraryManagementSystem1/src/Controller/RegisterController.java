/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.RegisterModel;
import View.Register;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilmi
 */
public class RegisterController {
    
    private Register view;
    private RegisterModel model;

    public RegisterController(Register view) {
        this.view = view;
        this.model = new RegisterModel();
    }
    
    public void addStudent(String username, String password) {
        try {
            model.addStudent(username, password);
            JOptionPane.showMessageDialog(view, "Successfully Saved");
            view.clearFields(); 
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
