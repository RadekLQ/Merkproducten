package be.oak3.persistance;

import be.oak3.model.Parfum;
import be.oak3.model.Product;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BestellingImplTest {

    Parfum parfum1 = new Parfum(0, "Dolce & Gabbana", "Light Blue", 100, 66.72);
    Parfum parfum2 = new Parfum(0, "BVLGARI", "BLV", 75, 61.52);
    Parfum parfum3 = new Parfum(0, "Georgio Armani", "Code Donna", 50, 59.32);
    Parfum parfum4 = new Parfum(0, "Givency", "Absolutely Irresistible", 75, 75.42);
    Parfum parfum5 = new Parfum(0, "Ted Lapidus", "Pour Elle", 50, 44.48);
    Parfum parfum6 = new Parfum(0, "Georgio Armani", "Code Donna", 30, 39.84);
    Parfum parfum7 = new Parfum(0, "Georgio Armani", "Code Donna", 75, 76.00);

//    public List<Parfum> parfum = Lists.newArrayList();
    public List<Product> parfum = new ArrayList<>();
    for (Product product: parfum) {
        if (product instanceof Parfum) {
            parfum.add(parfum1);
        }
    }





    @Test
    public void testVoegProductToe() throws Exception {
    }

    @Test
    public void testsorteer() throws Exception {
    }

    @Test
    public void testSorteerOpMerk() throws Exception {
    }

    @Test
    public void testSorteerOpVolume() throws Exception {
    }

    @Test
    public void testLijstVanBepaaldMerk() throws Exception {
    }

    @Test
    public void testLijstVanParfums()  {


    }

    @Test
    public void testLijstVanGoedkopeProducten() throws Exception {
    }

    @Test
    public void testZoekDuursteProduct() throws Exception {
    }

    @Test
    public void testTotalePrijs() throws Exception {
    }

}