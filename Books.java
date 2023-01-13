package files;

public class Books {
    private String bookName;
    private String bookWriter;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public Books(String bookName, String bookWriter) {
        this.bookName = bookName;
        this.bookWriter = bookWriter;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "'" + bookName + '\'' +
                ", автор-'" + bookWriter + '\'' +
                '}';
    }
}