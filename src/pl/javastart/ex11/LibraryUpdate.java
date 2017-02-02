package pl.javastart.ex11;

/**
 * Created by Rysiek on 2017-02-02.
 */
public class LibraryUpdate {

    public static void main(String[] args) {

        Book book = new Book(1, "Lalka", "Bolesław Prus", 1990, "12323454321");

        BookDAO bookDAO = new BookDAO();
        bookDAO.update(book);
        bookDAO.close();
    }
}
