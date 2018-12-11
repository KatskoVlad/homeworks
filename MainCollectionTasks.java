package homework.homeWork10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainCollectionTasks {

    private Set<Book> setBook = new HashSet<Book>();
    private List<Book> list = new LinkedList<>();

    public static void main(String[] args) {
        MainCollectionTasks mainCollectionTasks = new MainCollectionTasks();

        Task1 task1Instance = new Task1();
        task1Instance.task1(mainCollectionTasks.getList());
        mainCollectionTasks.setList(task1Instance.getList());

        Task2 task2Instance = new Task2();
        task2Instance.task2();
        mainCollectionTasks.setSetBook(task2Instance.getSetBook());

        Task3 task3Instance = new Task3();
        task3Instance.task3(mainCollectionTasks.getSetBook());

        Task4 task4Instance = new Task4();
        task4Instance.task4();

        Task5 task5Instance = new Task5();
        task5Instance.task5();
    }

    public Set<Book> getSetBook() {
        return setBook;
    }

    public void setSetBook(Set<Book> setBook) {
        this.setBook = setBook;
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }
}
