package Day10POO;

// import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User youngerUser = new User("Farhan Hasin Junior", "2005-01-31");

        System.out.printf("%s was born in %s and he is now %d years old.\n", youngerUser.getName(),
                youngerUser.getBirthDay(), youngerUser.age());

        Book book1 = new Book("The Lord of the Rings", "XXXXXXXXXXXXXX", 270);
        AudioBook audioBook1 = new AudioBook("The Lord of the Rings", "XXXXXXXXXXXXXX", 300000);
        Ebook ebook1 = new Ebook("The Lord of the Rings", "XXXXXXXXXXXXXX", 280, "PDF");

        youngerUser.borrow(book1);
        System.out.println(audioBook1.toString());
        System.out.println(ebook1.toString());

        System.out.println(youngerUser.borrowedBooks());

    }
}
