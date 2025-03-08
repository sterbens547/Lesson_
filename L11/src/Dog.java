import javax.xml.namespace.QName;

public class Dog extends Animals{
    public Dog (String name){
        super(name);
    }
    @Override
    public void run(int dist) {
        if (dist <= 500) {
            System.out.println(name + " пробежала: " + dist);
        }else {
            System.out.println("");
        }
    }
}
