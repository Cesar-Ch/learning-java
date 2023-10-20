package Exercises;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        String[] numbers = num.split("");

        if (numbers[0].equals(numbers[3]) && numbers[1].equals(numbers[2])) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
        //  (−15,12]∪(14,17)∪[19,+∞)
        System.out.println(-14);
    }

    
}