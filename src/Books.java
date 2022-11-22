public class Books {
   private final String bookTitle;
    private final Author author;
    private int yearOfPublication;

    public Books(String bookTitle, Author author, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        }
    public String getBookTitle() {
        return bookTitle;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public Author getAuthor() {
        return author;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;

    }
}

