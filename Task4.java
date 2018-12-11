package homework.homeWork10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public void task4() {
        System.out.println("Task #4");
        GeneratorGroupStudents generatorGroupStudents = new GeneratorGroupStudents();
        generatorGroupStudents.generateGroup(0, "Alex", "Rogkov", 18, "182412");
        generatorGroupStudents.generateGroup(1, "Evgeniy", "Frolov", 19, "111892");
        generatorGroupStudents.generateGroup(2, "Dima", "Kozlov", 17, "321985");
        generatorGroupStudents.generateGroup(3, "Sergey", "Petrov", 16, "182421");
        generatorGroupStudents.generateGroup(4, "Gena", "Ivanov", 18, "182412");

//        for (int i=0; i<students.size(); i++) {
//            if (i%2==0) {
//                System.out.println(students.get(i).toString());
//            } else {
//                students.remove(students.get(i));
//            }
//        }
//        int i = 0;
//        for (Student student : students) {
//            i++;
//            if (i%2==0) {
//                System.out.println(students);
//            } else {
//                students.remove(students);
//            }
//        }
        int i = 0;
        Iterator<Student> iterator = generatorGroupStudents.getStudents().iterator();
        while (iterator.hasNext()) {
            Student setElement = iterator.next();
            i++;
            if (i % 2 == 0) {
                System.out.println(setElement);
                iterator.remove();
            } else {
                iterator.remove();
            }
        }
        printCollectionStudent(generatorGroupStudents.getStudents());
    }

    public static void printCollectionStudent(Set<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
