package homework.homeWork10;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    private final static char[] ARRAYVOWELS = {'A', 'E', 'I', 'O', 'U', 'Y'};
    public void task2(Set<Book> setBook) {
        System.out.println("Task #2");

        for (int i = 0; i < 4; i++) {
            setBook.add(new Book("Three Men In a Boat", 1975, "Jerome", "K.", "Jeromess"));
        }
        for (int i = 0; i < 5; i++) {
            setBook.add(new Book("The Curious Case of Benjamin Button", 2008, "Francis", "Scott", "Фитцджеральд"));
        }
        for (int i = 0; i < 5; i++) {
            setBook.add(new Book("Year 1984", 1984, "George", "Orwell", "Jeromess"));
        }
        for (int i = 0; i < 6; i++) {
            setBook.add(new Book("History 2001: A Space Odyssey", 2001, "Arthur", "Clarke", "Richards"));
        }
        for (int i = 0; i < 5; i++) {
            setBook.add(new Book("Gladiator", 1995, "Dewey", "Gram", "Stephens"));
        }
        for (Book book : setBook) {
            for (char letter : ARRAYVOWELS) {
                if (book.getTitleBook().startsWith(String.valueOf(letter))) {
                    System.out.println(book);
                }
            }
        }
    }
}