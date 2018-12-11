package homework.homeWork10;

import java.util.Set;
import java.util.TreeSet;

public class GeneratorGroupStudents {

    private Set<Student> students = new TreeSet<>();

    public void generateGroup(int id, String name, String surname, int age, String group){
        students.add(new Student(id, name, surname, age, group));
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
