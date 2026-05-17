import java.sql.*;

public class MarvellousJDBC
{
    public static void main(String[] args)
    {
        try
        {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/PPA54",
                "root",
                ""   // put your MySQL password here
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Process Result
            while(rs.next())
            {
                System.out.println("Roll No : " + rs.getInt("rno"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("City    : " + rs.getString("city"));
                System.out.println("Marks   : " + rs.getInt("marks"));
                System.out.println("-----------------------------");
            }

            // Close connections
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred: " + e);
        }
    }
}