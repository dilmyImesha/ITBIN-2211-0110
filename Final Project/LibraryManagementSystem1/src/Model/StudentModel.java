package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Dilmi
 */

public class StudentModel {

    private Connection con;

    public StudentModel() {
        con = DBConnection.getConnection();
    }

    public void addStudent(String id, String name, String address, String gender, String faculty) throws SQLException {
        PreparedStatement pst = con.prepareStatement("INSERT INTO student (StudentId, Student_name, Address, Gender, Faculty) VALUES (?, ?, ?, ?,?)");
        pst.setString(1, id);
        pst.setString(2, name);
        pst.setString(3, address);
        pst.setString(4, gender);
        pst.setString(5, faculty);
        pst.executeUpdate();
    }

    public void updateStudent(String id, String name, String address, String gender, String faculty) throws SQLException {
        PreparedStatement pst = con.prepareStatement("UPDATE student SET Student_name = ?, Address = ?, Gender = ?, Faculty =?  WHERE StudentId = ?");
        pst.setString(1, name);
        pst.setString(2, address);
        pst.setString(3, gender);
        pst.setString(4, faculty);
        pst.setString(5, id);
        pst.executeUpdate();
    }

    public void deleteStudent(String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("DELETE FROM student WHERE StudentId = ?");
        pst.setString(1, id);
        pst.executeUpdate();
    }

    public Vector<Vector<String>> getAllStudents() throws SQLException {
        Vector<Vector<String>> data = new Vector<>();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM student");
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            Vector<String> row = new Vector<>();
            row.add(rs.getString("StudentId"));
            row.add(rs.getString("Student_name"));
            row.add(rs.getString("Address"));
            row.add(rs.getString("Gender"));
            row.add(rs.getString("Faculty"));
            data.add(row);
        }
        return data;
    }

    public String getNextStudentID() throws SQLException {
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT MAX(StudentID) FROM student");
        rs.next();
        String maxID = rs.getString("MAX(StudentId)");
        if (maxID == null) {
            return "S0001";
        } else {
            long id = Long.parseLong(maxID.substring(2)) + 1;
            return "S0" + String.format("%03d", id);
        }
    }
}
