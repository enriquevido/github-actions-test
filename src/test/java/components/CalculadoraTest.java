package components;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void testSuma(){
        assertEquals(5.0, calculadora.calcularOperacion(2, 3, "+"));
    }

    @Test
    void testResta(){
        assertEquals(24, calculadora.calcularOperacion(36, 12, "-"));
    }

    @Test
    void testMultiplicacion(){
        assertEquals(64, calculadora.calcularOperacion(8, 8, "*"));
    }

    @Test
    void testDivision(){
        assertEquals(8, calculadora.calcularOperacion(72, 9, "/"));
    }

    @Test
    void testExcepcion(){
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularOperacion(2, 3, "."));
    }
}
