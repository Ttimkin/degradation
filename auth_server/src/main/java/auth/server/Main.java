package auth.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:authDB.db");
        } catch (SQLException hui) {
            System.err.println("DB not found");
            hui.printStackTrace();
        }

        

        try {
            conn.close();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
}