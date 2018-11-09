import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

//https://junit.org/junit5/docs/current/user-guide/
public class StandardTest {
    @Test
    void succeedingTest() {
        assertNotEquals(2, 1 + 1);
    }


    @Test
    void failingTest() {
        assertTrue("Maxim".startsWith("M"));
        //assertEquals(true, "Maxim".startsWith("M"));
    }

    @Test
    void failingTest2() {
        assertTrue("Maxim".startsWith("zz"));
    }

}