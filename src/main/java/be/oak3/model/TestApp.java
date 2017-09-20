package be.oak3.model;

import be.oak3.persistance.Bestelling;
import be.oak3.persistance.BestellingImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TestApp {

    //LOG4J
    private static final Logger logger = LoggerFactory.getLogger(TestApp.class);

    public static void main(String[] args) {

        logger.info("Entering application.");
        logger.trace("Entering application.");

        System.out.printf("Oplossing van %s %s\n", "Radek Lizak ", "student Java Developer Oak3/VDAB/QNH\\n");

        Bestelling bestelling = new BestellingImpl();
        List<Product> lijst = Data.getData();

        for (Product artikel : lijst) {
            bestelling.voegProductToe(artikel);
        }

//      System.out.println("Lijst gesorteerd op natuurlijke volgorde: ");  -> console application
        logger.info("Lijst gesorteerd op natuurlijke volgorde: ");
        bestelling.sorteer();

        logger.info("\nLijst gesorteerd op merk: ");
        bestelling.sorteerOpMerk();

        logger.info("\nLijst gesorteerd op volume: ");
        bestelling.sorteerOpVolume();

        logger.info("\nVan het merk Georgio Armani:");
        bestelling.lijstVanBepaaldMerk("Georgio Armani");

        logger.info("\nAlle Parfums:");
        bestelling.lijstVanParfums();

        logger.info("\nAlle producten onder €50; ");
        bestelling.lijstVanGoedkopeProducten();

        Product product = bestelling.zoekDuursteProduct();
        logger.info("\nDuurste product:\n" + product);

        logger.info("\nTotale prijs: €%.2f", bestelling.totalePrijs());

        logger.info("Exiting application.");
        logger.trace("Exiting application.");
    }
}