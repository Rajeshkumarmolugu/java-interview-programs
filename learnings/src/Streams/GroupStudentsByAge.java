package learnings.src.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class GroupStudentsByAge {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("rajesh",1,"test@test.com",20),
                new Student("rakesh",2,"test1@test.com",24),
                new Student("kumar",3,"test2@test.com",24),
                new Student("Buddy",4,"test2@test.com",20)
        ));

        Map<Integer,List<Student>> groupedStudents = students.stream().collect(Collectors.groupingBy(Student::getAge));

        System.out.println(groupedStudents);
        //or
        groupedStudents.forEach((age, studentList) ->
                System.out.println(age + " -> " + studentList));    }

}
