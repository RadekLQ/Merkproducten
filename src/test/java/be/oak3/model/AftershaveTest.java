package be.oak3.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AftershaveTest {

    private Aftershave aftershave = new Aftershave(1002, "Yves Saint Laurent", "Jazz", 50, 39.84,
            Aftershave.Soort.VAPO);

    @Test
    public void testToString() {
        assertThat(aftershave).isInstanceOfAny(Product.class);
        assertThat(aftershave).isInstanceOf(Product.class);
        assertThat(aftershave).isInstanceOf(Aftershave.class);
        assertThat(aftershave).isNotNull();
        assertThat(aftershave.getProductNummer()).isEqualTo(1002);
        assertThat(aftershave.getMerk()).isEqualTo("Yves Saint Laurent");
        assertThat(aftershave.getNaam()).isEqualTo("Jazz");
        assertThat(aftershave.getVolume()).isEqualTo(50);
        assertThat(aftershave.getPrijs()).isEqualTo(39.84);
        assertThat(aftershave.toString()).contains("GEL");
        assertThat(aftershave.toString()).containsIgnoringCase("GEL");
    }
}