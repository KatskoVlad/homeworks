package homework.homeWork10;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    private final static char[] ARRAYVOWELS = {'A', 'E', 'I', 'O', 'U', 'Y'};
    private Set<Book> setBook = new HashSet<>();
    public void task2() {

        System.out.println("Task #2");

        GeneratorBooks generatorBooks = new GeneratorBooks();
        generatorBooks.copyBook(4, "Three Men In a Boat", 1975, "Jerome", "K.", "Jeromess");
        generatorBooks.copyBook(5, "The Curious Case of Benjamin Button", 2008, "Francis", "Scott", "Фитцджеральд");
        generatorBooks.copyBook(5, "Year 1984", 1984, "George", "Orwell", "Jeromess");
        generatorBooks.copyBook(6, "History 2001: A Space Odyssey", 2001, "Arthur", "Clarke", "Richards");
        generatorBooks.copyBook(5, "Gladiator", 1995, "Dewey", "Gram", "Stephens");

        setBook.addAll(generatorBooks.getBooks());
        for (Book book : setBook) {
            for (char letter : ARRAYVOWELS) {
                if (book.getTitleBook().startsWith(String.valueOf(letter))) {
                    System.out.println(book);
                }
            }
        }
    }

    public Set<Book> getSetBook() {
        return setBook;
    }

    public void setSetBook(Set<Book> setBook) {
        this.setBook = setBook;
    }
}