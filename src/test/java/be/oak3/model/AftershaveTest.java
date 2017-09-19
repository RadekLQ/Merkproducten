package be.oak3.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AftershaveTest {

    Aftershave aftershave = new Aftershave(0, "Yves Saint Laurent", "Jazz", 50, 39.84,
            Aftershave.Soort.VAPO);

    @Test
    public void testToString()  {
        assertThat(aftershave).isInstanceOfAny(Product.class);
        assertThat(aftershave).isInstanceOf(Product.class);
        assertThat(aftershave).isInstanceOf(Aftershave.class);
        assertThat(aftershave).isInstanceOf(Aftershave.Soort.VAPO);
        assertThat(aftershave).isNotNull();

    }

}