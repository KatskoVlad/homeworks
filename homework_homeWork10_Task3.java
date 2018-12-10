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
        ComparatorAuthorName comparatorAuthorName = new ComparatorAuthorName();
        ComparatorAllName comparatorAuthorLastName = new ComparatorAllName();
        ComparatorAuthorMiddleName comparatorAuthorMiddleName = new ComparatorAuthorMiddleName();
        System.out.println("Sorted by AuthorName");
        library.sort(comparatorAuthorName);
        printCollectionBook(library);
        System.out.println("Sorted by Author Last Name");
        library.sort(comparatorAuthorLastName);
        printCollectionBook(library);
        System.out.println("Sorted by Author Middle Name");
        library.sort(comparatorAuthorMiddleName);
        printCollectionBook(library);
    }
    public static void printCollectionBook(List<Book> books){
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
