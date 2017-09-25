package be.oak3.persistance;

import be.oak3.model.Product;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class BestellingDaoImpl implements Bestelling {

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

    @Override
    public void voegProductToe(Product product) {

    }

    @Override
    public void sorteer() {
    }

    @Override
    public void sorteerOpMerk() {
    }

    @Override
    public void sorteerOpVolume() {
    }

    @Override
    public Product zoekDuursteProduct() {
        return null;
    }

    @Override
    public double totalePrijs() {
        return 0;
    }

    @Override
    public List<Product> lijstVanBepaaldMerk(String merk) {
        return null;
    }

    @Override
    public List<Product> lijstVanParfums() {
        return null;
    }

    @Override
    public List<Product> lijstVanGoedkopeProducten() {
        return null;
    }

    @Override
    public List<Product> getBestelling() {
        return null;
    }
}
