import com.javaCode.Addition;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @org.junit.jupiter.api.Test
    void add() {
        int result = Addition.add(3,2);
        int correct = 5;

        assertEquals(5,result);
    }
}