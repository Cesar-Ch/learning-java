package Day09HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 90);
        examScores.put("English", 88);
        examScores.put("History", 78);
        examScores.put("Science", 99);

        System.out.println(examScores.toString());
        System.out.println(examScores.get("English"));

        examScores.replace("Math", 70);
        System.out.println(examScores.toString());

        System.out.println(examScores.size());

        System.out.println(examScores.containsKey("Geography"));
        examScores.remove("History");

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });
    }
}
