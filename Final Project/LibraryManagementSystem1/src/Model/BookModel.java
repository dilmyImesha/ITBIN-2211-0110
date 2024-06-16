package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dilmi
 */

public class BookModel {

    private Connection con;
    private PreparedStatement insert;

    public BookModel() {
        con = DBConnection.getConnection();
    }

    public void addBook(String bookNo,String title, String author, String category, String availability) {
        try {
            
            insert = con.prepareStatement("INSERT INTO book (BookID, BookTitle, Author, Category, Status) VALUES (?, ?, ?, ?,?)");
            insert.setString(1, bookNo);
            insert.setString(2, title);
            insert.setString(3, author);
            insert.setString(4, category);
            insert.setString(5, availability);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editBook(String bookNo, String title, String author, String category, String availability) {
        try {
            insert = con.prepareStatement("UPDATE book SET BookTitle=?, Author = ?, Category = ?, Status = ? WHERE BookID = ?");
            insert.setString(1, title);
            insert.setString(2, author);
            insert.setString(3, category);
            insert.setString(4, availability);
            insert.setString(5, bookNo);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteBook(String bookNo) {
        try {
            insert = con.prepareStatement("DELETE FROM book WHERE BookID = ?");
            insert.setString(1, bookNo);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Vector<Vector<String>> getAllBooks() {
        Vector<Vector<String>> data = new Vector<>();
        try {Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM book");
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("BookID"));
                row.add(rs.getString("BookTitle"));
                row.add(rs.getString("Author"));
                row.add(rs.getString("Category"));
                row.add(rs.getString("Status"));
                data.add(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public String getNextBookNo() {
        
        String nextBookNo = "B0001";
        try {
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(BookID) FROM book");
            if (rs.next() && rs.getString(1) != null) {
                long id = Long.parseLong(rs.getString(1).substring(2));
                id++;
                nextBookNo = "B0" + String.format("%03d", id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nextBookNo);
        return nextBookNo;
    }
}

