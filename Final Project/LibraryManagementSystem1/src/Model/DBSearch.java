package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dilmi
 */

public class DBSearch {
    public ResultSet searchLogin(Connection con, String usName) throws SQLException {
        String query = "SELECT * FROM login WHERE username = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, usName);
        return pstmt.executeQuery();
    }
}
