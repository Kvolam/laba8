import exception.NullPointer;

import java.util.ArrayList;

public class MinValue {


    int minValue(ArrayList<Integer> list) throws NullPointer {
        if(!list.isEmpty() && list!=null ) {
            return list.stream()
                    .min(Integer::compareTo)
                    .get();
        }
        else {
            throw new NullPointer("Список пуст");
        }
    }
}
