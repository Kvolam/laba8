import exception.NullPointer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MinValueTest {

    @org.junit.Test
    public void minValue() throws NullPointer {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        MinValue minValue = new MinValue();
        int expected = minValue.minValue(list);
        int actual = 1;
        assertEquals(expected, actual);
    }
}