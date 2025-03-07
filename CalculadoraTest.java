import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("---Inicio de las pruebas---");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("---Final de las pruebas---");
    }

    @BeforeEach
    void setUp() throws Exception {
        calc = new Calculadora();
    }

    @Test
    void testSuma() {
        assertEquals(5, calc.suma(2, 3));
        assertEquals(-1, calc.suma(-2, 1));
        assertEquals(0, calc.suma(0, 0));
    }

    @Test
    void testResta() {
        assertEquals(1, calc.resta(3, 2));
        assertEquals(-3, calc.resta(-2, 1));
        assertEquals(0, calc.resta(0, 0));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(6, calc.multiplicacion(2, 3));
        assertEquals(-2, calc.multiplicacion(-2, 1));
        assertEquals(0, calc.multiplicacion(0, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.division(6, 3));
        assertEquals(-2, calc.division(-6, 3));
        assertThrows(ArithmeticException.class, () -> calc.division(1, 0));
    }

    @Test
    void testCalcular() {
        assertEquals(5, Calculadora.calcular(2, 3, 1));
        assertEquals(1, Calculadora.calcular(3, 2, 2));
        assertEquals(6, Calculadora.calcular(2, 3, 3));
        assertEquals(2, Calculadora.calcular(6, 3, 4));
        assertThrows(ArithmeticException.class, () -> Calculadora.calcular(1, 0, 4));
        assertThrows(IllegalArgumentException.class, () -> Calculadora.calcular(1, 1, 5));
    }
}