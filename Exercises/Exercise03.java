package Exercises;
// import java.io.*;
import java.util.*;

public class Exercise03 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while(i > 0){
                 if (scanner.hasNextLong()) {
                     long num = scanner.nextLong();
                System.out.println(num + " can be fitted in:");
            
                if (num >= -128 && num <= 127) {
                    System.out.println("* byte");
                }
                if (num >= -32768 && num <= 32767) {
                    System.out.println("* short");
                }
                if (num >= -2147483648 && num <= 2147483647) {
                    System.out.println("* int");
                }
                if (num >= -9223372036854775808L && num <= 9223372036854775807L) {
                    System.out.println("* long");
                }
                 } else {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
                     
                 }
            i--;
            
        }
        scanner.close();
    }
}
