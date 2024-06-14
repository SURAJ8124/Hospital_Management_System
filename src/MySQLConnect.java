import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnect {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/facebookapi", // database URL
                    "root", // username
                    "root@123" // password
            );

            // Create a statement object to execute queries
            statement = connection.createStatement();

            // Execute a query
            String query = "SELECT * FROM users";
            resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                // Assuming your_table_name has columns 'id' and 'name'
                int faceBookId = resultSet.getInt("faceBookId");
                String name = resultSet.getString("name");
                System.out.println("ID: " + faceBookId + ", Name: " + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
