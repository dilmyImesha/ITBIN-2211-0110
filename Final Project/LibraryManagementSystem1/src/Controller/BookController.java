
package Controller;

import Model.BookModel;
import View.BookDetails;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilmi
 */

public class BookController {

    private final BookDetails view;
    private final BookModel model;

    public BookController(BookDetails view) {
        this.view = view;
        this.model = new BookModel();
    }

    public void addBook(String bookNo, String title, String author, String category, String availability) {
        model.addBook(bookNo, title, author, category, availability);
        table_update();
        JOptionPane.showMessageDialog(view, "Successfully Saved");
    }

    public void editBook(String bookNo, String title, String author, String category, String availability) {
        model.editBook(bookNo, title, author, category, availability);
        table_update();
        JOptionPane.showMessageDialog(view, "Record Updated");
    }

    public void deleteBook(String bookNo) {
        model.deleteBook(bookNo);
        table_update();
        JOptionPane.showMessageDialog(view, "Record Deleted");
    }

    public void table_update() {
        view.setTableData(model.getAllBooks());
    }

    public String autoID() {
        return model.getNextBookNo();
    }

}
