package be.oak3.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeodorantTest {

    Deodorant deodorant = new Deodorant(1003, "DKNY", "Be Delicious Women", 100, 33.65,
            Deodorant.DeoType.STICK);

    @Test
    public void testToString() {
        assertThat(deodorant).isInstanceOfAny(Product.class);
        assertThat(deodorant).isInstanceOf(Product.class);
        assertThat(deodorant).isInstanceOf(Deodorant.class);
        assertThat(deodorant).hasToString(Deodorant.DeoType.STICK.toString());
        assertThat(deodorant).isNotNull();

        assertThat(deodorant.getProductNummer()).isEqualTo(1003);
        assertThat(deodorant.getMerk()).isEqualTo("DKNY");
        assertThat(deodorant.getNaam()).isEqualTo("Be Delicious Women");
        assertThat(deodorant.getVolume()).isEqualTo(100);
        assertThat(deodorant.getPrijs()).isEqualTo(33.65);
    }
}