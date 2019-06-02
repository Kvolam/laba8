import exception.NullPointer;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AverageListTest {

    @Test
    public void averageList() throws NullPointer {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1);
        AverageList averageList = new AverageList();
        int expected = averageList.averageList(list);
        int actual = 4;
        assertEquals(expected, actual);
    }
}