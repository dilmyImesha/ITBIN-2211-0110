package Controller;

import Model.StudentModel;
import View.StudentDetails;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilmi
 */

public class StudentController {
    
    private StudentDetails view;
    private StudentModel model;

    public StudentController(StudentDetails view) {
        this.view = view;
        this.model = new StudentModel();
    }
    
    public void addStudent(String id, String name, String address, String gender, String faculty) {
        try {
            model.addStudent(id, name, address, gender, faculty);
            
            JOptionPane.showMessageDialog(view, "Successfully Saved");
            view.clearFields(); 
            tableUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateStudent(String id, String name, String address, String gender, String faculty) {
        try {
            model.updateStudent(id, name, address, gender,faculty);
            JOptionPane.showMessageDialog(view, "Successfully Updated");
            view.clearFields();
            tableUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteStudent(String id) {
        try {
            model.deleteStudent(id);
            JOptionPane.showMessageDialog(view, "Successfully Deleted");
            view.clearFields();
            tableUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void autoID() {
        try {
            String nextID = model.getNextStudentID();
            view.setStudentID(nextID);
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tableUpdate() {
        try {
            view.updateTable(model.getAllStudents());
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
