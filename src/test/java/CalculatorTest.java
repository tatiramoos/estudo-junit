import com.tatiramos.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testSomar() {
        Calculator calc = new Calculator();
        Assertions.assertTrue(calc.soma(2,3) == 5 );
        Assertions.assertEquals(5, calc.soma(2,3) );
    }

    @Test
    public void assertivas() {
        Assertions.assertEquals("Casa", "Casa");
        Assertions.assertNotEquals("Casa", "casa");
        Assertions.assertTrue("casa".equalsIgnoreCase("CASA"));
        Assertions.assertTrue("Casa".endsWith("sa"));
        Assertions.assertTrue("Casa".startsWith("Ca"));

        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        List<String> s3 = null;

        Assertions.assertEquals(s1, s2);
        Assertions.assertSame(s1, s1);
        Assertions.assertNotEquals(s1, s3);
        Assertions.assertNull(s3);
        Assertions.assertNotNull(s1);
        /*Assertions.fail("Falhou pelo motivo A");*/
    }
}
