import javax.xml.namespace.QName;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
        dogCount++;
        System.out.println("Имя собаки: " + name);
    }

    @Override
    public void run(int runDist) {
        super.run(runDist);
    }

    @Override
    public void swim(int swimDist) {
        super.swim(swimDist);
    }
}
