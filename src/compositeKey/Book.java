package compositeKey;

public class Book {
    private String bookId;
    private String authorName;
    private String isbn;

    public Book(String authorname, String isbn) {
        this.authorName = authorname;
        this.isbn = isbn;
        this.bookId = this.authorName.substring(0, 7).concat(this.isbn.substring(isbn.length()-4, isbn.length()));
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", authorname='" + authorName + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
