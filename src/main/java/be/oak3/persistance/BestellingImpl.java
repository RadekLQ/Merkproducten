package be.oak3.persistance;

import be.oak3.model.Parfum;
import be.oak3.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BestellingImpl implements Bestelling {

//    INSTANCE VARIABLES

    public List<Product> bestelling = new ArrayList<>();

    public BestellingImpl() {

    }

    @Override
    public void voegProductToe(Product product) {
        bestelling.add(product);
        //ProductNummer++;

    }

    @Override
    public void sorteer() {
        bestelling.stream().sorted().forEach(System.out::println);
//        bestelling.stream().sorted().forEach(bestelling -> LOGGER.log(Level.DEBUG,bestelling));
//

    }

    @Override
    public void sorteerOpMerk() {
        bestelling.stream().sorted(Product.sorteerOpMerknaam()).forEach(System.out::println);
    }

    @Override
    public void sorteerOpVolume() {
        bestelling.stream().sorted(Comparator.comparing(Product::getVolume).thenComparing(Product::getProductCode))
                .forEach(System.out::println);
    }

    @Override
    public void toonPerMerk(String merk) {
        bestelling.stream().filter(product -> product.getMerk().equals(merk))
                .sorted(Comparator.comparing(Product::getProductCode)).forEach(System.out::println);

    }

    @Override
    public void toonParfums() {
        List<Product> parfums = new ArrayList<>();
        for (Product p : bestelling) {
            if (p instanceof Parfum) {
                parfums.add(p);
            }
        }
        parfums.stream().sorted(Comparator.comparing(Product::getProductCode)).forEach(System.out::println);

    }

    @Override
    public void toonGoedkopeProducten() {
        bestelling.stream().filter(product -> product.getPrijs() <= 50.00D)
                .sorted(Comparator.comparing(Product::getProductCode)).forEach(System.out::println);
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