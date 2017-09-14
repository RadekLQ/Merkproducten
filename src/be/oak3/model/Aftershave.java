package be.oak3.model;

import java.util.Comparator;

public class Aftershave extends Product {
    enum Soort {VAPO, GEL;}

    private Soort soort;

    public Aftershave(int productNummer, String merk, String naam, int volume, double prijs, Soort soort) {
        super(productNummer, merk, naam, volume, prijs);
        this.soort = soort;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + soort;
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
