package be.oak3.persistance;

import be.oak3.model.Parfum;
import be.oak3.model.Product;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BestellingImpl implements Bestelling {

    private static final Logger logger = LogManager.getLogger();
    private static int productNummer = 1000;
    private List<Product> bestelling = Lists.newArrayList();

    public BestellingImpl() {
    }

    public List<Product> getBestelling() {
        return bestelling;
    }

    @Override
    public void voegProductToe(Product product) {
        product.setProductNummer(productNummer);
        bestelling.add(product);
        productNummer++;
    }

    @Override
    public void sorteer() {
        Collections.sort(bestelling, Comparator.comparing(Product::getProductNummer));

        bestelling.stream().sorted(Comparator.comparing(Product::getProductNummer)).forEach(logger::info);
    }

    @Override
    public void sorteerOpMerk() {
        Collections.sort(bestelling, Comparator.comparing(Product::getMerk));
        bestelling.stream().sorted(Product.sorteerOpMerknaam()).forEach(logger::info);
    }

    @Override
    public void sorteerOpVolume() {
        Collections.sort(bestelling, Comparator.comparing(Product::getVolume));
        bestelling.stream().sorted(Comparator.comparingInt(Product::getVolume)).forEach(logger::info);
    }

//    @Override
//    public void toonPerMerk(String merk) {
//        bestelling.stream().filter(product -> product.getMerk().equals(merk)).forEach(logger::info);
//    }

//    @Override
//    public void toonGoedkopeProducten() {
//        bestelling.stream().filter(product -> product.getPrijs() < 50).forEach(logger::info);
//    }


    public Product zoekDuursteProduct() {

        return Collections.max(bestelling, Comparator.comparing(Product::getPrijs));
    }

    @Override
    public double totalePrijs() {
        return bestelling.stream().mapToDouble(Product::getPrijs).sum();
    }

    @Override
    public List<Product> lijstVanBepaaldMerk(String merk) {
        List<Product> result = bestelling.stream().filter(product -> product.getMerk().equals(merk)).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Product> lijstVanParfums() {
        List<Product> result = bestelling.stream().filter(product -> product instanceof Parfum).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Product> lijstVanGoedkopeProducten() {
        List<Product> result = bestelling.stream().filter(product -> product.getPrijs() < 50).collect(Collectors.toList());
        return result;
    }

//    @Override
//    public void toonParfums() {
//        bestelling.stream().filter(product -> product instanceof Parfum).forEach(logger::info);
//    }

}