import java.util.Map;
import java.util.Set;

public class Student {

    private String name;
    private String group;
    private int course;
    private Map<String, Double> ratings;

    public Student(String name,String group,int course,Map<String, Double> ratings){
        this.name = name;
        this.group = group;
        this.course = course;
        this.ratings = ratings;
    }

    public double averageScore() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double gr : ratings.values()) {
            sum += gr;
        }
        return sum / ratings.size();
    }
    public String getName() {
        return name;
    }
    public  int getCourse() {
        return course;
    }
    public void relapse(int coutse) {
        this.course = course;
    }

}
