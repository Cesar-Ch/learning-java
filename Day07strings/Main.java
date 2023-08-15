package Day07strings;

public class Main {
    public static void main(String[] args) {
        String text = "smiles";
        String text2 = new String("smiles");
        System.out.println("smiles".substring(1, 5));
        System.out.println("smiles".length());
        System.out.println("smiles".charAt(1));
        System.out.println("smiles".indexOf("m"));
        System.out.println("smiles" == text);
        System.out.println("smiles" == text2);
        System.out.println("smiles".equals("smiles"));

        String str = "All who wander are not lost";
        int y = str.compareTo("Are you lost?"); // r - l
        int z = str.compareTo("Add it up!"); // l - d
        System.out.println(y);
        System.out.println(z);

        double d = 10.0 - 9.1;
        System.out.println(d);
        System.out.printf("%.2f", d);

    }
}
