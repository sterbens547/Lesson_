import java.util.HashSet;
import java.util.Map;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Student> students = new HashSet<>();
        students.add(new Student("Иван Иванов", "Группа 101", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Петр Петров", "Группа 102", 2, Arrays.asList(2, 3, 2)));
        students.add(new Student("Сидор Сидоров", "Группа 103", 1, Arrays.asList(5, 5, 5)));
        students.add(new Student("Мария Иванова", "Группа 101", 2, Arrays.asList(3, 4, 3)));

        // Удаляем с балом меньше 3
        delete(students);

        // Переводим студентов
        translation(students);

        // Выводим студентов
        printStudents(students, 3);
    }

    // удаления студентов
    public static void delete(Set<Student> students) {
        students.removeIf(student -> student.getAverage() < 3.0);
    }

    // перевод студентов с
    public static void translation(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverage() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    //  вывод студентов определенного курса
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }




}
