package be.oak3.persistance;

import be.oak3.model.Aftershave;
import be.oak3.model.Data;
import be.oak3.model.Parfum;
import be.oak3.model.Product;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class BestellingImplTest {
    private Bestelling bestelling;

    @Before
    public void init() {
        List<Product> lijst = Lists.newArrayList();
        lijst = Data.getData();
        bestelling = new BestellingImpl();
        for (Product product : lijst) {
            if (product instanceof Product) {
                lijst.add(product);
            }
        }
    }

    @Test
    public void testLijstVanParfum() {
        assertThat(bestelling).isInstanceOf(Parfum.class);
        assertThat(bestelling).isExactlyInstanceOf(Aftershave.class);
//        assertThat(bestelling.lijstVanParfums()).isNotNull();
//        assertThat(bestelling.lijstVanParfums()).hasSize(7);
//        assertThat(bestelling.lijstVanParfums()).first().isInstanceOf(Parfum.class);
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
    public void testZoekDuursteProduct() throws Exception {
    }

    @Test
    public void testTotalePrijs() throws Exception {
    }

}