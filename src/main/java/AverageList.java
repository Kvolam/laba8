import exception.NullPointer;

import java.util.ArrayList;


public class AverageList {

    public Integer averageList(ArrayList<Integer> list) throws NullPointer {
        if (list != null && !list.isEmpty()) {
            return list.stream()
                    .mapToInt(Integer::intValue)
                    .sum() / list.size();
        } else {
            throw new NullPointer("Список пуст");
        }
    }
}

