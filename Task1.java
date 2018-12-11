package homework.homeWork10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {

    private List<Book> list = new LinkedList<>();

    public void task1(List<Book> list){

        System.out.println("Task #1");

        GeneratorBooks generatorBooks = new GeneratorBooks();
        generatorBooks.copyBook(1,"The Fisherman and His Soul", 1929,
                "Oscar","Wilde", "Williams");
        generatorBooks.copyBook(1,"The Million Pound Bank Note", 1956,
                "Matk", "Twain", "Jonovich");
        generatorBooks.copyBook(1, "Mr. Bean In Town",  1986,
                "Richard", "Curtis", "Richards");

        for (int i = 0; i<generatorBooks.getBooks().size(); i++) {
            list.add(generatorBooks.getBooks().get(i));
        }
        for (Book book: list) {
            System.out.println(book);
        }
        list.remove(1);
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }
}
