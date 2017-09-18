package be.oak3.model;

public class Aftershave extends Product {

    //GENESTE ENUM
    public enum Soort {
        VAPO, GEL;
    }

    //INSTANCE VARIABELEN
    private Soort soort;

    public Aftershave(int productNummer, String merk, String naam, int volume, double prijs, Soort soort) {
        super(productNummer, merk, naam, volume, prijs);
        this.soort = soort;
    }

    //Overschrijven van toString methode
    @Override
    public String toString() {
        return super.toString() + "\t" + soort.toString();
    }


}
