public class Circle implements Matc{
    private double radius;
    private String fcolor;
    private String bicolor;

    public Circle (double radius) {
        this.radius = radius;

    }
    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void fillColor(String color) {
        this.fcolor = color;

    }

    @Override
    public void borderColor(String bcolor) {
        this.bicolor = bcolor;

    }

    @Override
    public void info() {
        System.out.println("Perimtr: " + perimetr() + ", Area: " + area() + ", Fill " + fcolor + ", Border " + bicolor);

    }
}
