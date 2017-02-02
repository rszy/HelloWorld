package pl.javastart.ex11;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-02-02.
 */
public class LibraryDelete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id książki, którą chcesz usunąć:");
        int id = scanner.nextInt();

        BookDAO bookDAO = new BookDAO();
        bookDAO.delete(id);

    }
}
