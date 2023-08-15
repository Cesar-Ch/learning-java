// package Day-04-arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = { "John", "Jane", "Mary" };
        int[] ages = { 23, 34, 45 };

        System.out.println(names.length);
        System.out.println(ages[0]);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + " Age: " + ages[i]);
        }

        for (int i : ages) {
            System.out.println(i);
        }

        int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
