package pl.javastart.ex11;

import java.util.Scanner;

/**
 * Created by Rysiek on 2017-01-31.
 */
public class LibrarySave {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł:");
        String title = scan.nextLine();
        System.out.println("Podaj autora:");
        String author = scan.nextLine();
        System.out.println("Podaj rok:");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Podaj isbn:");
        String isbn = scan.nextLine();

        Book book1 = new Book(title, author, year, isbn);
        BookDAO bookDAO = new BookDAO();
        bookDAO.save(book1);
        bookDAO.close();

    }
}
