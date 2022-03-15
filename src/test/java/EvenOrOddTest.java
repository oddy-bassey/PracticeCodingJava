import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EvenOrOddTest {

    @Test
    public void isEvenTrue(){
        assertTrue(EvenOrOdd.isEven(2));
        assertTrue(EvenOrOdd.isEven(4));
        assertTrue(EvenOrOdd.isEven(6));
        assertTrue(EvenOrOdd.isEven(8));
        assertTrue(EvenOrOdd.isEven(10));
        assertTrue(EvenOrOdd.isEven(12));
        assertTrue(EvenOrOdd.isEven(14));
    }

    @Test
    public void isEvenFalse(){
        assertFalse(EvenOrOdd.isEven(1));
        assertFalse(EvenOrOdd.isEven(3));
        assertFalse(EvenOrOdd.isEven(5));
        assertFalse(EvenOrOdd.isEven(7));
        assertFalse(EvenOrOdd.isEven(9));
        assertFalse(EvenOrOdd.isEven(11));
        assertFalse(EvenOrOdd.isEven(13));
    }
}
