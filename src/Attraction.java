public class Attraction {
    private String name;
    private String hour;
    private double price;

    public void attraction (String name,String hour,double price) {
        this.name = name;
        this.hour = hour;
        this.price = price;
    }
    public void info (){
        System.out.println("Атракцион: " +name);
        System.out.println("Время работы" +hour);
        System.out.println("Цнеа: " + price);
    }

    public Attraction(String name, String hour, double price) {
        System.out.println("Object created");
        attraction(name,hour,price);
        info();
    }
}
