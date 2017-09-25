package be.oak3.persistance;

import be.oak3.model.Bereknebaar;
import be.oak3.model.Product;

import java.util.List;

public interface Bestelling extends Bereknebaar {
    void voegProductToe(Product product);

    void sorteer();

    void sorteerOpMerk();

    void sorteerOpVolume();

    Product zoekDuursteProduct();

    List<Product> lijstVanBepaaldMerk(String merk);

    List<Product> lijstVanParfums();

    List<Product> lijstVanGoedkopeProducten();

    List<Product> getBestelling();


}