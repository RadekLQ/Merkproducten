package be.oak3.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Comparator;

import static org.apache.commons.lang3.StringUtils.join;


public abstract class Product implements Comparator<Product>, Comparable<Product>, Serializable {

    private static int productNr = 1000;
    public String merk;
    //    INSTANCE VARIABELEN
    private int productNummer;
    private String naam;
    private int volume;
    private double prijs;

    // CONSTRUCTOR met parameters
    public Product(int productNummer, String merk, String naam, int volume, double prijs) {
        this.productNummer = productNummer;
        this.merk = merk;
        this.naam = naam;
        this.volume = volume;
        this.prijs = prijs;
        this.productNr++;
    }

    //GETTERS

    public static Comparator<Product> sorteerOpMerknaam() {
        return Comparator.comparing(Product::getMerk);
    }

    public int getProductNummer() {
        return productNummer;
    }

    public String getMerk() {
        return merk;
    }

    public String getNaam() {
        return naam;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getProductCode() {
//        return (merk.substring(0, 3) + naam.substring(0, 3) + volume).toUpperCase().replace(" ", "_");
//        https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
//        https://examples.javacodegeeks.com/core-java/apache/commons/lang3/stringutils/org-apache-commons-lang3-stringutils-example/

        return StringUtils.upperCase(join(StringUtils.substring(merk, 0, 3), StringUtils.substring(naam, 0, 3), volume));
       // return join(left(merk, 3), left(naam, 3), volume)).replaceAll("","_").toUpperCase();
    }

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getMerk().compareTo(o2.getMerk());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }

        Product p = (Product) o;
        return productNummer == p.getProductNummer();
    }

    @Override
    public int hashCode() {
        return productNummer;
    }

    @Override
    public int compareTo(Product p) {
        return productNummer - p.getProductNummer();
    }

    @Override
    public String toString() {
        return String.format("%d %s %-20s %10s %-24s %10s %3sml %8s %4.2f %5s %s",
                getProductNummer(), "Merk:", getMerk(), "Naam:", getNaam(), "Volume:", getVolume(),
                "Prijs:", getPrijs(), "Code:", getProductCode());
    }
}
