import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Calculadora;

class CalculadoraTest {

    Calculadora c;

    @BeforeEach
    public void setUp(){
        c = new Calculadora();
    }

    @Test
    public void somaTest(){
        int resultado = c.soma(2,6);
        assertEquals(8, resultado);
    }

    @Test
    public void subTest(){
        int resultado = c.sub(5,7);
        assertEquals(-2, resultado);
    }

    @Test
    public void multTest(){
        int resultado = c.mult(5,7);
        assertEquals(35, resultado);
    }

    @Test
    public void divTest(){
        int a = 4, b = 2;
        assumeTrue(b != 0);
        double resultado = c.div(4,2);
        assertEquals(2, resultado);
    }

    @Test
    public void divZeroTest(){
        int a = 4, b = 0;
        assumeTrue(b == 0);
        assertThrows(IllegalArgumentException.class, () -> {
            c.div(4,0);
        });
    }
}