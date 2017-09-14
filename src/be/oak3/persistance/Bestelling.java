package be.oak3.persistance;

import be.oak3.model.Bereknebaar;
import be.oak3.model.Product;

public interface Bestelling extends Bereknebaar {
    void voegProductToe(Product product);

    void sorteer();

    void sorteerOpMerk();

    void sorteerOpVolume();

    void toonPerMerk();

    void toonParfums();

    void toonGoedkopeProducten();

    void zoekDuursteProduct();
}
