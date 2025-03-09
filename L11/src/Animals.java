public class Animals {

    protected static int animalsCount = 0;
    protected static int dogCount = 0;
    protected static int catCount = 0;

    protected String name;



    public void setValues(String name) {
        this.name = name;
    }

    public Animals(String name) {
        setValues(name);
        animalsCount++;

    }

    public void run(int runDist) {
        if (runDist <= 500) {
            System.out.println(name + " пробежал: " + runDist + " м ");
        } else {
            System.out.println(name + " не может пробежать: " + runDist + " м ");
        }
    }

    public void swim(int swimDist) {
        if (swimDist <= 10) {
            System.out.println(name + " проплыл " + swimDist + " м  ");
        } else {
            System.out.println(name + " не может проплыть " + swimDist + " м ");
        }

    }
    public static void totalAnimals() {
        System.out.println("Всего животных: " + animalsCount);
        System.out.println("Всего собак: " + dogCount);
        System.out.println("Всего котов: " + catCount);
    }
}