package be.oak3.persistance;

import be.oak3.model.Bereknebaar;
import be.oak3.model.Product;

public interface Bestelling extends Bereknebaar {

    public void voegProductToe(Product product);

    public void sorteer();

    public void sorteerOpMerk();

    public void sorteerOpVolume();

//    public void toonPerMerk(String merk); -> console application
    public void lijstVanBepaaldMerk(String merk);

//    public void toonParfums(); -> console application
    public void lijstVanParfums();

//    public void toonGoedkopeProducten(); -> console application
    public void lijstVanGoedkopeProducten();

    public Product zoekDuursteProduct();

    public double totalePrijs();
}