package selftrain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest2 {
@Test
    void mulTest(){
    var calc1 = new Calculator();
    assertEquals(27,calc1.addInt(3,9));
}
}