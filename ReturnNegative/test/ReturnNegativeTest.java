import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnNegativeTest {
    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }
}