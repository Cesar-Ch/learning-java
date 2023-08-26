package Exercises;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();
        String name2 = scanner.next();

        System.out.println("Hello, " + name + "!");
        System.out.println("Hello, " + name2 + "!");

        scanner.close();
    }
}
