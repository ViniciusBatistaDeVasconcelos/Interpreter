
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CelsiusTest {

    @Test
    void deveConverterNumeroParaFahrenheit() {
        Celsius celsius = new Celsius(10);
        assertEquals(50.0, celsius.converterFahrenheit(), 0.1);
    }

    @Test
    void deveConverterNumeroParaKelvin() {
        Celsius celsius = new Celsius(10);
        assertEquals(283.15, celsius.converterKelvin(), 0.1);
    }
}