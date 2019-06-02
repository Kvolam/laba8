import exception.NullPointer;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FoundFibonacci {

    ArrayList<Integer>  foundFibonacci(ArrayList<Integer> list) throws NullPointer {
       if(list==null || list.isEmpty()) {
          throw new NullPointer("Пустой список");
       }
        else {
           ArrayList<Integer> collect;
           collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                   .limit(10)
                   .map(t -> t[0])
                   .collect(Collectors.toCollection(ArrayList::new));
           return list.stream().filter(i -> collect.stream().anyMatch(i::equals)).collect(Collectors.toCollection(ArrayList::new));
       }
    }
}
