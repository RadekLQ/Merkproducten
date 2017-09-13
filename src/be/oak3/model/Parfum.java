package be.oak3.model;

import java.util.Comparator;

public class Parfum extends Producten {

    public Parfum(int productNummer, String merk, String naam, int volume, double prijs) {
        super(productNummer, merk, naam, volume, prijs);
    }

    @Override
    public String toString() {
        return super.toString() + "\t";
    }

    @Override
    public int compare(Producten o1, Producten o2) {
        return 0;
    }

    @Override
    public Comparator<Producten> reversed() {
        return null;
    }


}
