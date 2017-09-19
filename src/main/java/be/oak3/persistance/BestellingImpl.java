package be.oak3.persistance;

import be.oak3.model.Parfum;
import be.oak3.model.Product;
import com.google.common.collect.Lists;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BestellingImpl implements Bestelling {

//    INSTANCE VARIABLES

    private static final Logger LOGGER = Logger.getLogger(BestellingImpl.class.getName());

//    https://google.github.io/guava/releases/22.0/api/docs/com/google/common/collect/Lists.html

    //    public List<Product> bestelling = new ArrayList<>();
    public List<Product> bestelling = Lists.newArrayList();

    public BestellingImpl() {

    }

    @Override
    public void voegProductToe(Product product) {
        bestelling.add(product);
        //ProductNummer++;

    }

    @Override
    public void sorteer() {
//      bestelling.stream().sorted().forEach(System.out::println);
        bestelling.stream().sorted().forEach(bestelling -> LOGGER.log(Level.INFO, bestelling));
    }

    @Override
    public void sorteerOpMerk() {
//        bestelling.stream().sorted(Product.sorteerOpMerknaam()).forEach(System.out::println);
        bestelling.stream().sorted(Product.sorteerOpMerknaam()).forEach(bestelling -> LOGGER.log(Level.INFO, bestelling));

    }

    @Override
    public void sorteerOpVolume() {
//        bestelling.stream().sorted(Comparator.comparing(Product::getVolume).thenComparing(Product::getProductCode))
//                .forEach(System.out::println);
        bestelling.stream().sorted(Comparator.comparing(Product::getVolume).thenComparing(Product::getProductCode))
                .forEach(bestelling -> LOGGER.log(Level.INFO, bestelling));
    }

    @Override
    public void toonPerMerk(String merk) {
//        bestelling.stream().filter(product -> product.getMerk().equals(merk))
//                .sorted(Comparator.comparing(Product::getProductCode)).forEach(System.out::println);
        bestelling.stream().filter(product -> product.getMerk().equals(merk))
                .sorted(Comparator.comparing(Product::getProductCode)).forEach(bestelling -> LOGGER.log(Level.INFO, bestelling));
    }

    @Override
    public void toonParfums() {
        List<Product> parfums = new ArrayList<>();
        for (Product p : bestelling) {
            if (p instanceof Parfum) {
                parfums.add(p);
            }
        }
//        parfums.stream().sorted(Comparator.comparing(Product::getProductCode)).forEach(System.out::println);
        parfums.stream().sorted(Comparator.comparing(Product::getProductCode)).forEach(bestelling -> LOGGER.log(Level.INFO, bestelling));

    }

    @Override
    public void toonGoedkopeProducten() {
//        bestelling.stream().filter(product -> product.getPrijs() <= 50.00D)
//                .sorted(Comparator.comparing(Product::getProductCode)).forEach(System.out::println);
        bestelling.stream().filter(product -> product.getPrijs() <= 50.00D)
                .sorted(Comparator.comparing(Product::getProductCode)).forEach(bestelling -> LOGGER.log(Level.INFO, bestelling));
    }

    @Override
    public Product zoekDuursteProduct() {
        return bestelling.stream().max(Comparator.comparing(Product::getPrijs)).orElseThrow(RuntimeException::new);
        //orElseThrow(RunimeException::new)
    }

    @Override
    public double totalePrijs() {
        return bestelling.stream().mapToDouble(Product::getPrijs).sum();
    }
}