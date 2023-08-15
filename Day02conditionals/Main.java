import Day02conditionals;

public class Main {
    public static void main(String[] args) {
        int myNum = 5;
        if (myNum < 5) {
            System.out.println("The number is less than 5");
        } else if (myNum == 5) {
            System.out.println("The number is equal to 5");
        } else {
            System.out.println("The number is greater than 5");
        }

        myNum = 6;

        switch (myNum) {
            case 5:
                System.out.println("The number is equal to 5");
                break;
            case 6:
                System.out.println("The number is equal to 6");
                break;
            default:
                System.out.println("The number is not equal to 5 or 6");
        }
    }
}
