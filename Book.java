package homework.homeWork10;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titleBook;
    private long publishingYear;
    private String authorName;
    private String authorLastName;
    private String authorMiddleName;

    public Book(String titleBook, long publishingYear, String authorName, String authorLastName, String authorMiddleName) {
        this.titleBook = titleBook;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.authorMiddleName = authorMiddleName;
    }

    public Book() {

    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public long getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(long publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorMiddleName() {
        return authorMiddleName;
    }

    public void setAuthorMiddleName(String authorMiddleName) {
        this.authorMiddleName = authorMiddleName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleBook='" + titleBook + '\'' +
                ", publishingYear=" + publishingYear +
                ", authorName='" + authorName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", authorMiddleName='" + authorMiddleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear &&
                Objects.equals(titleBook, book.titleBook) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorLastName, book.authorLastName) &&
                Objects.equals(authorMiddleName, book.authorMiddleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, publishingYear, authorName, authorLastName, authorMiddleName);
    }

    @Override
    public int compareTo(Book o) {
        return o.getAuthorName().compareTo(this.getAuthorName());
    }
}
