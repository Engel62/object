import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название " + bookTitle + " Автор " + author + " Дата издания " + yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return yearOfPublication == books.yearOfPublication && Objects.equals(bookTitle, books.bookTitle) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, yearOfPublication);
    }
}

