package Day10POO;

public class Ebook extends Book {
    private String format;

    public Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);

        this.format = format;
    }
}
