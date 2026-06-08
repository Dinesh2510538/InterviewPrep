package june20;

public class TextBook extends Book {

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public TextBook(String author) {
        this.author = author;
    }

    public String toString(String title,int tnumber) {
        return "june20.TextBook{" +
                "title='" + title + '\'' +
                "tagNumber='" + tnumber + '\'' +
                "author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
