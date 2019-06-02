import exception.NullPointer;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FoundFibonacciTest {

    @Test
    public void foundFibonacci() throws NullPointer {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        FoundFibonacci foundFibonacci =new FoundFibonacci();
        ArrayList<Integer> actual = foundFibonacci.foundFibonacci(list);
        assertEquals(actual,expected);
    }
}