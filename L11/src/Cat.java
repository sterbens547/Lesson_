public class Cat extends Animals {
    private boolean hungry;
    public Cat(String name) {
        super(name);
        catCount++;
        this.hungry = false;
        System.out.println("Имя кота: " + name);
    }

    public void run(int runDist) {
        if (runDist <= 200) {
            System.out.println(name + " пробежала: " + runDist + " м ");
        } else {
            System.out.println(name + " не может пробежать: " + runDist + " м ");
        }
    }
    public void swim(int swimDist) {
        System.out.println(name + " кошки не плавают.");
    }

    public void eit (Bowl bowl, int hun) {
        if (bowl.eitCat(hun)) {
            this.hungry = true;
            System.out.println("Сытый " + name);
        } else {
            System.out.println("Недостаточно еды " + name);
        }
    }

}
