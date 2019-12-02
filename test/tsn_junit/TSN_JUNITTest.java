package tsn_junit;

import org.junit.Test;
import static org.junit.Assert.*;

import static tsn_junit.TSN_JUNIT.myDiv;

public class TSN_JUNITTest {

    @Test
    public void test1MyDiv() throws Exception {
        assertTrue(myDiv(9, 3) == 3);
        assertTrue(myDiv(777, 7) == 111);
        assertTrue("Проверка деления 100 на 25", myDiv(100, 25) == 4);
    }

    @Test
    public void test2MyDiv() throws Exception {
        try {
            assertTrue("Проверка деления 5 на 0", myDiv(5, 0) == 0);
            fail("Нет ошибки при делении на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
        try {
            assertTrue("Проверка деления 0 на 0", myDiv(0, 0) == 0);
            fail("Нет ошибки при делении 0 на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }

}
