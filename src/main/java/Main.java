import exception.NullPointer;

import java.util.ArrayList;

public class Main {
    public static void
    main(String[] args) throws NullPointer {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        AverageList reverseList = new AverageList();
        System.out.println(reverseList.averageList(list));
        MinValue minValue = new MinValue();
        System.out.println(minValue.minValue(list));
        FoundFibonacci foundFibonacci = new FoundFibonacci();
        System.out.println(foundFibonacci.foundFibonacci(list));
    }
}
