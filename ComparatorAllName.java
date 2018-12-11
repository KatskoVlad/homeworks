package homework.homeWork10;

import java.util.Comparator;

public class ComparatorAllName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2){

//        int EQUAL = 0;
//        int BEFORE = -1;
//        int AFTER = 1;
//
//        if (o1 == o2){
//            return EQUAL;
//        }
//        else if (o1 == null){
//            return AFTER;
//        }
//        else if (o2 == null){
//            return BEFORE;
//        }

        return o1.getAuthorName().compareTo(o2.getAuthorName()) |
               o1.getAuthorLastName().compareTo(o2.getAuthorLastName()) |
               o1.getAuthorMiddleName().compareTo(o2.getAuthorMiddleName());
    }
}
