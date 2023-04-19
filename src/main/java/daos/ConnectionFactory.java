package daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * Connect to Database
 * @author hany.said
 */
public class ConnectionFactory {

    public static final String URL = "jdbc:mysql://localhost:3306/cars";
    public static final String USER = "root";
    public static final String PASS = "zipcode00";

    /**
     * Get a connection to database
     * @return Connection object
     */
    public static Connection getConnection()
    {
      try {
          DriverManager.registerDriver(new Driver());
          return DriverManager.getConnection(URL, USER, PASS);
      } catch (SQLException ex) {
          throw new RuntimeException("Error connecting to the database", ex);
      }
    }

    // /**
    //  * Test Connection
    //  */
    // public static void main(String[] args) {
    //     Connection connection = ConnectionFactory.getConnection();
    // }

}

