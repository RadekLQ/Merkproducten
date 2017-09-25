package be.oak3.persistance;

import be.oak3.model.Product;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;

public class BestellingDaoImpl implements Bestelling {

    public List<Product> producten;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Properties props = new Properties();
        String sqlMax = "SELECT MAX(prijs) AS MaxPrijs FROM product;";

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
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlMax);

            double maxPrice = 0;

            if (rs.next()) {
                maxPrice = rs.getDouble(1);
            }

            System.out.format("%s", maxPrice);

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
