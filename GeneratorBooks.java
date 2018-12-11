package homework.homeWork10;

import java.util.ArrayList;
import java.util.List;

public class GeneratorBooks {
    private  List<Book> books = new ArrayList();
    public void copyBook(int countCopy,
                               String titleBook,
                               long publishingYear,
                               String authorName,
                               String authorLastName,
                               String authorMiddleName){
        for (int i=0; i<countCopy; i++){
            books.add(new Book(titleBook, publishingYear, authorName, authorLastName, authorMiddleName));
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
