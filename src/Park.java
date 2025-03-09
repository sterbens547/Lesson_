public class Park {
    private String name;
    private String hour;
    private double price;

    public void attraction (String name, String hour, double price) {
        this.name = name;
        this.hour = hour;
        this.price = price;
    }
    public void info (){
        System.out.println("Атракцио: " + name);
        System.out.println("Время работы: " + hour);
        System.out.println("Цена: " + price);
    }

    public Park (String name, String hour, double price) {
        attraction(name,hour,price);
        info();
    }
}
