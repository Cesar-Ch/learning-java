package Exercises;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise01 {
    public static void main(String[] args) throws IOException {
        System.out.println("================================");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String input = reader.readLine();
            String text = input.split(" ")[0];
            String number = input.split(" ")[1];
            // text = text + " ".repeat(15 - text.length());
            // number = "0".repeat(3 - number.length()) + number;
            text = String.format("%-15s", text);
            number = String.format("%03d", Integer.parseInt(number));
            System.out.println(text + number);
        }

        System.out.println("================================");
    }
}
