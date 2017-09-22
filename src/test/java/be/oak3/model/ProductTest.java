package be.oak3.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

//http://joel-costigliola.github.io/assertj/

public class ProductTest {
//  AssertJ

    private Product product = new Parfum(1001, "Dolce & Gabbana", "Light Blue", 100, 66.72);

//  jUnit

    private Product parfum;

    @Before
    public void init() {
        parfum = new Parfum(1001, "BVLGARI", "BLV", 75, 61.52);
    }

    @Test
    public void testProduct() {
        Assert.assertEquals("Testing ProductNummer", 1001, parfum.getProductNummer(), 0.000001);
        Assert.assertEquals("Testing merk", "BVLGARI", parfum.getMerk());
        Assert.assertEquals("Testing naam", "BLV", parfum.getNaam());
        Assert.assertEquals("Testing volume", 75, parfum.getVolume(), 0.000001);
        Assert.assertEquals("Testing prijs", 61.52, parfum.getPrijs(), 0.000001);
    }

//  AssertJ

    @Test
    public void testProduct2() {
        assertThat(product.getProductNummer()).isEqualTo(1001);
        assertThat(product.getProductCode()).isEqualTo("DOLLIG100");
        assertThat(product.getMerk()).isEqualTo("Dolce & Gabbana");
        assertThat(product.getNaam()).isEqualTo("Light Blue");
        assertThat(product.getVolume()).isEqualTo(100);
        assertThat(product.getPrijs()).isEqualTo(66.72);
        assertThat(product).isNotNull();
        assertThat(product).isInstanceOf(Parfum.class);
        assertThat(product).isInstanceOf(Product.class);
    }

    @Test
    public void testProductCode() {
        assertThat(product.getProductCode()).isEqualTo("DOLLIG100");
        assertThat(parfum.getProductCode()).isEqualTo("BVLBLV75");
        assertThat(product.getProductCode()).isNotNull();
        assertThat(parfum.getProductCode()).isNotNull();
    }
}