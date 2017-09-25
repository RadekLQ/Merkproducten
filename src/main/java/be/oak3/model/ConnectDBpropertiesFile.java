package be.oak3.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


//https://www.journaldev.com/2471/jdbc-example-mysql-oracle
//https://stackoverflow.com/questions/4085420/how-do-i-read-a-properties-file-and-connect-a-mysql-database
public class ConnectDBpropertiesFile {


    public static void main(String[] args) {
        Properties props = new Properties();

        try {
            FileInputStream fis = new FileInputStream("Merkproducten.properties");
            props.load(fis);
            fis.close();

            //load the Driver Class
            String driver = props.getProperty("DB_DRIVER_CLASS");
            if (driver != null) {
                Class.forName(driver);
            }

            //create the connection now
            String url = props.getProperty("DB_URL");
            String username = props.getProperty("DB_USERNAME");
            String password = props.getProperty("DB_PASSWORD");
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connect to DB OK");
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            System.out.println("Oops, something went wrong!");
            ex.printStackTrace(System.err);
        }
    }
}
