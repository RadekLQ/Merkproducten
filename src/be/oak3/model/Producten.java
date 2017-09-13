package be.oak3.model;

import java.text.NumberFormat;
import java.util.Comparator;

public abstract class Producten implements Comparator<Producten> {
    private int productNummer;
    public String merk;
    private String naam;
    private int volume;
    private double prijs;

    public Producten(int productNummer, String merk, String naam, int volume, double prijs) {
        this.productNummer = productNummer;
        this.merk = merk;
        this.naam = naam;
        this.volume = volume;
        this.prijs = prijs;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producten producten = (Producten) o;

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

    public static Comparator<Producten> sorteerOpMerknaam() {
        return (o1, o2) -> o1.getMerk().compareTo(o2.getMerk());

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

}
