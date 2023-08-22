package Day08ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.toString());
        numbers.remove(Integer.valueOf(4));
        System.out.println(numbers.toString());
        numbers.set(2, Integer.valueOf(30));
        numbers.add(33);
        numbers.add(24);
        numbers.add(15);
        System.out.println(numbers.toString());
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());
        System.out.println(numbers.get(2));
        System.out.println(numbers.contains(Integer.valueOf(10)));
        System.out.println(numbers.contains(Integer.valueOf(1)));
        numbers.forEach(number -> {
            System.out.println(number * 2);
        });
        System.out.println(numbers.indexOf(1));
    }
}
