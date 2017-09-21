package be.oak3.persistance;

import be.oak3.model.Aftershave;
import be.oak3.model.Data;
import be.oak3.model.Product;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BestellingImplTest {

    private static Bestelling bestelling, bestelling2;

    @BeforeClass
    public static void init() {
        List<Product> lijst = Data.getData();
        bestelling = new BestellingImpl();
        for (Product artikel : lijst) {
            bestelling.voegProductToe(artikel);
        }
        bestelling2 = new BestellingImpl();
        for (Product artikel : lijst) {
            bestelling2.voegProductToe(artikel);
        }
    }

    @Test
    public void voegProductToeTest() {
        Product product = new Aftershave(0, "Yves Saint Lauren", "Jazz", 50, 39.84,
                Aftershave.Soort.VAPO);
        bestelling.voegProductToe(product);

        assertThat(bestelling.getBestelling().get(11)).extracting(Product::getMerk).contains("Yves Saint Lauren");
    }

    @Test
    public void testLijstVanParfum() {

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
    public void testLijstVanGoedkopeProducten() throws Exception {
    }

    @Test
    public void testZoekDuursteProduct() {
        assertThat(bestelling.zoekDuursteProduct()).isNotNull();
        assertThat(bestelling.zoekDuursteProduct().getPrijs()).isEqualTo(76.00);
        assertThat(bestelling.zoekDuursteProduct()).isEqualTo(bestelling2.zoekDuursteProduct());
    }

    @Test
    public void testTotalePrijs() throws Exception {
    }
}