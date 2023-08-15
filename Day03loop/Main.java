public class Main {
    public static void main(String[] args) {

        // WHILE LOOP
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        i = 0;

        // DO/WHILE LOOP
        do {
            System.out.println(i);
            i++;
        } while (i < 0);

        // FOR LOOP
        for (int k = 1; k <= 2; k++) {
            System.out.println("Outer: " + k);

            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }

        // FOR-EACH LOOP
        String[] cars = { "1", "2", "3", "4" };
        for (String z : cars) {
            System.out.println(z);
        }

        // BREAK - CONTINUE
        for (int w = 0; w < 10; w++) {
            if(w == 2){
                continue;
            }
            if (w == 7) {
                break;
            }
            System.out.println(w);
        }
    }
}
