//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(" Шарик");
        dog.run(150);
        dog.swim(7);

        Dog dog1 =new Dog("Чаки");
        dog1.run(600);
        dog1.swim(15);


        Cat cat1 = new Cat("Зорька");
        cat1.run(150);
        cat1.swim(12);
        Cat cat2 = new Cat("Клякса");
        cat2.run(300);
        cat1.swim(2);
        Cat cat3 = new Cat("Васька");
        Cat cat4 = new Cat("Партизан");

        Bowl bowl = new Bowl(10);
        cat1.eit(bowl,16);
        cat2.eit(bowl,9);
        bowl.addingFood(20);
        Bowl bowl1 = new Bowl(15);
        cat3.eit(bowl1,23);
        cat4.eit(bowl,9);


        Animals.totalAnimals();


    }
}