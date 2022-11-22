public class Main {
    public static void main(String[] args) {
        Author author = new Author("Дмитрий","Глуховский");
        Author author1 = new Author("Александр", "Мазин");
        Books book = new Books("Метро 2033", author, 2005);
        Books book1 = new Books("Варяг", author1, 2001);
        System.out.println(author.getName() + " " +author.getSurname() + " <<" + book.getBookTitle() + ">> , " + book.getYearOfPublication());
        System.out.println(author1.getName() + " " +author1.getSurname() + " <<" + book1.getBookTitle() + ">>, " + book1.getYearOfPublication());
        book1.setYearOfPublication(2002);
        System.out.println(book1.getYearOfPublication());
    }
}