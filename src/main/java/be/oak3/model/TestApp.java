package be.oak3.model;

import be.oak3.persistance.Bestelling;
import be.oak3.persistance.BestellingImpl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApp {

    final static Logger logger = LoggerFactory.getLogger(TestApp.class);

    public static void main(String[] args) {

        logger.info("Entering application.");
        logger.trace("Entering application.");

        System.out.printf("Oplossing van %s %s\n", "Radek Lizak ",
                "student Enterprise Java Developer Oak3/VDAB/QNH\\n");

        Bestelling bestelling = new BestellingImpl();
        List<Product> lijst = Data.getData();

        for (Product artikel : lijst) {
            bestelling.voegProductToe(artikel);
        }

        System.out.println("Lijst gesorteerd op natuurlijke volgorde: ");
        bestelling.sorteer();

        System.out.println("\nLijst gesorteerd op merknaam: ");
        bestelling.sorteerOpMerk();

        System.out.println("\nLijst gesorteerd op volume: ");
        bestelling.sorteerOpVolume();

        System.out.println("\nVan het merk Georgio Armani:");
        bestelling.toonPerMerk("Georgio Armani");

        System.out.println("\nAlle Parfums:");
        bestelling.toonParfums();

        System.out.println("\nAlle producten onder €50; ");
        bestelling.toonGoedkopeProducten();

        Product product = bestelling.zoekDuursteProduct();
        System.out.println("\nDuurste product:\n" + product);

        System.out.printf("\nTotale prijs: €%.2f", bestelling.totalePrijs());

        logger.info("Exiting application.");
        logger.trace("Exiting application.");

    }
}
