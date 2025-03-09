public class Rectangle implements Matc{

    private double width;
    private double length;
    private String fcolor;
    private String bcolor;

    public Rectangle (double width,double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimetr() {
        return 2 * (width * length);
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public void fillColor(String color) {
        this.fcolor = color;

    }

    @Override
    public void borderColor(String bcolor) {
        this.bcolor = bcolor;

    }

    @Override
    public void info() {
        System.out.println("Perimetr: " + perimetr() + ", Aree: " + area() + ", fill color " + fcolor + ", bord color " + bcolor);

    }
}
