package be.oak3.model;

import java.util.Comparator;

public class Parfum extends Product {

    public Parfum(int productNummer, String merk, String naam, int volume, double prijs) {
        super(productNummer, merk, naam, volume, prijs);
    }

    @Override
    public String toString() {
        return super.toString() + "\t";
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }

    @Override
    public Comparator<Product> reversed() {
        return null;
    }


}
