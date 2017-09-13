package be.oak3.persistance;

import be.oak3.model.Bereknebaar;
import be.oak3.model.Producten;

public interface Bestelling extends Bereknebaar {
     abstract Producten voegProductToe(Producten product);
     abstract Producten sorteer();
     abstract Producten sorteerOpMerk();
     abstract Producten sorteerOpVolume();
     abstract String toonPerMerk();
     abstract Producten toonParfums();
     abstract Producten toonGoedkopeProducten();
     abstract Producten zoekDuursteProduct();
}
