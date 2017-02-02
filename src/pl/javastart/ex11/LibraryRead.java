package pl.javastart.ex11;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by Rysiek on 2017-02-02.
 */
public class LibraryRead {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer isbn książki");
        String isbn = scanner.nextLine();

        BookDAO bookDAO = new BookDAO();
        try {
            System.out.println(bookDAO.read(bookDAO.readIsbn(isbn)).toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        bookDAO.close();
    }
}
