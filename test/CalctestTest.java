import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalctestTest {
    @Test
    void testcalc2x()
    {
        double testCalc = Calculator.multiplyMethod(2,3);

        assertEquals(testCalc,6);
    }
    @Test
    void testcalc3x(){
        double testCalc = Calculator.multiplyMethod(2,3,1);

        assertEquals(testCalc,6);
    }
}