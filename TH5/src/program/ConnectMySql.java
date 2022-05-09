package program;
import java.sql.*;

public class ConnectMySql {
    public static void querry(Statement stmt) throws SQLException {
        String strSelect = "select * from books";
        System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

        ResultSet rset = stmt.executeQuery(strSelect);

        // Step 4: Process the 'ResultSet' by scrolling the cursor forward via next().
        //  For each row, retrieve the contents of the cells with getXxx(columnName).
        System.out.println("The records selected are:");
        int rowCount = 0;
        // Row-cursor initially positioned before the first row of the 'ResultSet'.
        // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
        // It returns false if no more rows.
        while(rset.next()) {   // Repeatedly process each row
            int    id     = rset.getInt("id");
            String title  = rset.getString("title");  // retrieve a 'String'-cell in the row
            String author = rset.getString("author");
            double price  = rset.getDouble("price");  // retrieve a 'double'-cell in the row
            int    qty    = rset.getInt("qty");       // retrieve a 'int'-cell in the row
            System.out.printf("%d, %s, %s, %.2f, %d\n", id, title, author, price, qty);
            ++rowCount;
        }
        System.out.println("Total number of records = " + rowCount);
    }

    public static void delete(Statement stmt) throws SQLException {
        String sqlDelete = "delete from books where id >= 1004 and id < 4000";
        System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
        int countDeleted = stmt.executeUpdate(sqlDelete);
        System.out.println(countDeleted + " records deleted.\n");
    }

    public static void update(Statement stmt) throws SQLException {
        String strUpdate = "update books set price = price*1.07, qty = qty+1 where id = 1001";
        System.out.println("The SQL statement is: " + strUpdate + "\n");  // Echo for debugging
        int countUpdated = stmt.executeUpdate(strUpdate);
        System.out.println(countUpdated + " records affected.\n");
    }

    public static void insert(Statement stmt) throws SQLException {
        // INSERT a record
        String sqlInsert = "insert into books values (3001, 'Gone Fishing', 'Kumar', 11.11, 11)";
        System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
        int countInserted = stmt.executeUpdate(sqlInsert);
        System.out.println(countInserted + " records inserted.\n");
        // INSERT multiple records
        sqlInsert = "insert into books values "
                + "(3002, 'Gone Fishing 2', 'Kumar', 22.22, 22),"
                + "(3003, 'Gone Fishing 3', 'Kumar', 33.33, 33)";
        System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
        countInserted = stmt.executeUpdate(sqlInsert);
        System.out.println(countInserted + " records inserted.\n");

        // INSERT a partial record
        sqlInsert = "insert into books (id, title, author) values (3004, 'Fishing 101', 'Kumar')";
        System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
        countInserted = stmt.executeUpdate(sqlInsert);
        System.out.println(countInserted + " records inserted.\n");
    }

    public static void main(String[] args) {
        try (
                // Step 1: Construct a database 'Connection' object called 'conn'
                 Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/eshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "000000");   // For MySQL only
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
                // Step 2: Construct a 'Statement' object called 'stmt' inside the Connection created
                Statement stmt = conn.createStatement();
        ) {
            // Step 3: Write a SQL query string. Execute the SQL query via the 'Statement'.
            //  The query result is returned in a 'ResultSet' object called 'rset'.
//            delete(stmt);
//            insert(stmt);
//            update(stmt);
            querry(stmt);
        } catch(SQLException ex) {
            ex.printStackTrace();
        }  // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)
    }
}
