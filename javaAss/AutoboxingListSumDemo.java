// AutoboxingListSumDemo.java
import java.util.ArrayList;
import java.util.List;

public class AutoboxingListSumDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // autoboxing from int to Integer
        list.add(10);
        list.add(20);
        list.add(30);

        int sum = 0;
        for (Integer val : list) {
            sum += val; // automatic unboxing from Integer to int
        }
        System.out.println("List: " + list);
        System.out.println("Sum (using autounboxing): " + sum);
    }
}
