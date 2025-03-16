package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingObjectsByAge {

    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>(
                Arrays.asList(new Student("rajesh",1,"test@test.com",23),
                        new Student("john",1,"test@test.com",21),
                new Student("kiran",2,"tets@test.com",21)));

        student.stream().
                sorted(Comparator.comparing(Student::getAge).
                        thenComparing(Student::getSname))
                .forEach(s->System.out.println(s.getSname()));
    }
}
