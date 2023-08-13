package Exercises;
// import java.io.*;
import java.util.*;
import java.lang.Math;

public class Exercise02 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        int numCasos = scanner.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int numero2 = scanner.nextInt();
            int razon = scanner.nextInt();
            int cantidad = scanner.nextInt();
            int total = 0;

            for (int j = 0; j < cantidad; j++) {
                if (j == 0) {
                    total = numero2 + (int) Math.pow(2, j) * razon;
                } else {
                    total += (int) Math.pow(2, j) * razon;
                }

                System.out.print(total + " "); 
            }

            System.out.println(); 
        }

        scanner.close();

    }
}
