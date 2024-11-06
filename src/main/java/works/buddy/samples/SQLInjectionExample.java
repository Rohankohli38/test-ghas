package works.buddy.samples.vulnerabilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLInjectionExample {
    public void vulnerableMethod(String userInput) {
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        try {
            Connection conn = DriverManager.getConnection("jdbc:yourdatabaseurl");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            // Process the ResultSet here...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
