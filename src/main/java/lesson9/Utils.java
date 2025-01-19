package lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    private List<Student> students;

    public Utils() {
        students = new ArrayList<>();
    }

    public void addStudent(int age, String sex) {
        students.add((new Student(age, sex)));
    }

    public double getAverage() {
        return students.stream()
                .filter(student -> student.getSex().equals("male"))
                .mapToDouble(Student::getAge)
                .average()
                .orElse(0);
    }

    public List<Student> getStudentsSolders() {
        return students.stream()
                .filter(student -> student.getSex().equals("male"))
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27)
                .collect(Collectors.toList());
    }
}
