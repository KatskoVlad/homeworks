package homework.homeWork10;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Task3 {
    public void task3(Set<Book> setBook){
        System.out.println("Task #3");
        List<Book> library = new LinkedList<>();
        for (Book book : setBook) {
            library.add(book);
        }

        ComparatorAllName comparatorAllName = new ComparatorAllName();

        System.out.println("Sorted by AuthorName");
        library.sort(comparatorAllName);
        printCollectionBook(library);
        System.out.println("Sorted by Author Last Name");
        library.sort(comparatorAllName);
        printCollectionBook(library);
        System.out.println("Sorted by Author Middle Name");
        library.sort(comparatorAllName);
        printCollectionBook(library);
    }
    public static void printCollectionBook(List<Book> library){
        for (Book book : library) {
            System.out.println(book);
        }
    }
}
