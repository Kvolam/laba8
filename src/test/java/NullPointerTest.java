import exception.NullPointer;
import org.junit.Test;

import java.util.ArrayList;

public class NullPointerTest {
    @Test(expected = NullPointer.class)
    public void checkSize() throws NullPointer {
        ArrayList<Integer> arrayList = new ArrayList<>();
        AverageList averageList = new AverageList();
        averageList.averageList(arrayList);
    }

}