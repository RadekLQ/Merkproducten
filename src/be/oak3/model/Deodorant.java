package be.oak3.model;

import java.util.Comparator;

public class Deodorant extends Product {
    enum DeoType {VAPO, STICK}

    ;
    private DeoType deoType;

    public Deodorant(int productNummer, String merk, String naam, int volume, double prijs, DeoType deoType) {
        super(productNummer, merk, naam, volume, prijs);
        this.deoType = deoType;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + deoType;
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
