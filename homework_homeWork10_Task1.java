package homework.homeWork10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    static List<Book> list = new LinkedList<>();
    public void task1(List<Book> list){
        System.out.println("Task #1");

        List<Book> books = new ArrayList();
        books.add(new Book("The Fisherman and His Soul", 1929,
                                   "Oscar","Wilde", "Williams"));
        books.add(new Book("The Million Pound Bank Note", 1956,
                                   "Matk", "Twain", "Jonovich"));
        books.add(new Book("Mr. Bean In Town", 1986,
                                   "Richard", "Curtis", "Richards"));
        for (int i = 0; i<books.size(); i++) {
        list.add(books.get(i));
    }
        for (Book book: list) {
        System.out.println(book);
    }
        list.remove(1);
    }
}
