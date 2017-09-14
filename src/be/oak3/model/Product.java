package be.oak3.model;

import java.text.NumberFormat;
import java.util.Comparator;

public abstract class Product implements Comparator<Product> {

//    INSTANCE VARIABELEN
    private int productNummer;
    public String merk;
    private String naam;
    private int volume;
    private double prijs;

    // CONSTRUCTOR
    public Product(int productNummer, String merk, String naam, int volume, double prijs) {
        this.productNummer = productNummer;
        this.merk = merk;
        this.naam = naam;
        this.volume = volume;
        this.prijs = prijs;
    }

    //GETTERS

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product producten = (Product) o;

        return productNummer == producten.productNummer;
    }

    @Override
    public int hashCode() {
        return productNummer;
    }

    public String getProductCode() {
        StringBuilder code = new StringBuilder();
        code.append(getMerk().toUpperCase().replace(' ', '_').substring(0, 3))
                .append(getNaam().toUpperCase().replace(' ', '_').substring(0, 3))
                .append(String.valueOf((getVolume())));

        return code.toString();
    }



    /*
        public static Comparator<Product> sorteerOpMerknaam() {
                Comparator<Product> comparator = new Co here druk ENTER
                }

        }*/
    //

    public static Comparator<Product> sorteerOpMerknaam() {
     //Comparator<Product> comparator = new Comparator<Product>() {

         //public int compare(Product o1, Product o2) {
         //return o1.getMerk().compareTo(o2.getMerk());
         //}
         return Comparator.comparing(Product::getMerk);

         //return (p1,p2)
     }



    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        return productNummer + " " +
                "Merk: " + merk + "\t" +
                "Naam: " + naam + "\t" +
                "Volume: " + volume + "\t" +
                "Prijs: " + formatter.format(prijs).toString() + "\t" +
                "Code: " + getProductCode().toString() + "\t";
    }

    @Override
    public int compareTo(Product o) {
        return this.productNummer - o.productNummer;
    }

}
