package be.oak3.persistance;

import be.oak3.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BestellingImpl implements Bestelling {

    //INSTANCE VARIABELEN
    private static int productNummer = 1000;
    private List<Product> bestelling = new ArrayList<>();

    public BestellingImpl() {
    }

    @Override
    public void voegProductToe(Product artikel) {
        artikel.setProductNummer(productNummer += 1);
        bestelling.add(artikel);
    }

    @Override
    public void sorteer() {
        return ;
    }

    @Override
    public void sorteerOpMerk() {
        return ;
    }

    @Override
    public void sorteerOpVolume() {
        return ;
    }

    @Override
    public void toonPerMerk() {
        return ;
    }

    @Override
    public void toonParfums() {
        return ;
    }

    @Override
    public void toonGoedkopeProducten() {
        return ;
    }

    @Override
    public void zoekDuursteProduct() {
        return ;
    }

    @Override
    public double totalePrijs() {
        return 0;
    }
}
