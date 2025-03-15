import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Student>
                students = new HashSet<>();
        students.add(new Student("Сергей Маманович","Поток 26",1,Map.of("QA",7.1,"AQA",6.1)));
        students.add(new Student("Кирилл Корякин","Поток 26",1,Map.of("QA",5.1,"AQA",6.0)));
        students.add(new Student("Виктория Корень","Поток 26",1,Map.of("QA",4.1,"AQA",1.0)));
        students.add(new Student("Антон Дрозд","Поток 26",1,Map.of("QA",1.0,"AQA",2.0)));
        students.add(new Student("Миша Антонинко","Поток 26",1,Map.of("QA",4.1,"AQA",6.0)));

        System.out.println("Все студенты: ");
        infoStudent(students,1);



        // перевод на курс выше
        nextCourse(students);

        //удаление
        removal(students);

    }
    //сдуленты на курсе
    public static void infoStudent(Set<Student> students,int course) {
        System.out.println("Студенты " + course + " : ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    //перевод на курс выше
    public static void nextCourse( Set<Student> students) {
        for (Student student : students) {
            if (student.averageScore() >= 3.0) {
                System.out.println(student.getCourse() + 1);
        }
    }
    }
    // удаление
    public static void removal(Set<Student> students) {
    students.removeIf(student -> student.averageScore() <3);
    }
}
