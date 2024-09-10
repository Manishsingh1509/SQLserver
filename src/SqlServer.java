import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlServer {
    // Database connection parameters
    static final String DB_URL = "jdbc:sqlserver://DESKTOP-COV537M\\SQLEXPRESS:1433;databaseName=information;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

    public static void main(String[] args) throws Exception {
        // Load the SQL Server JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // Establish the connection
        Connection con = DriverManager.getConnection(DB_URL);
        System.out.println("Connection established successfully.");

        // Create a statement object
        Statement st = con.createStatement();
        
       // String create = "create table info1 (id int , Name varchar(255) , age int)";
        //st.executeUpdate(create);
        //String insert = "insert into info1 values(101,'Shyam',22)";
        //st.executeUpdate(insert);
//        String drop = "drop table info1";
//        st.executeUpdate(drop);
        
//        String delete = "Delete info where id = 108";
//        st.executeUpdate(delete);

        // Define and execute the query
        String query = "SELECT id, name, age FROM info1";
        ResultSet rs = st.executeQuery(query);

        // Process the result set
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        // Close the resources
        rs.close();
        st.close();
        con.close();
    }
}
