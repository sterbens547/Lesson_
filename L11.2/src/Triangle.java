public class Triangle implements Matc {

    private double a1;
    private double a2;
    private double a3;
    private String fcolor;
    private String bcolor;

    public Triangle (double a1,double a2,double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public double perimetr() {
        return a1 + a2 + a3;
    }

    @Override
    public double area() {
        double per = perimetr() / 2;
        return Math.sqrt(per * (per * a1) * (per * a2) * (per * a3));
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
        System.out.println("Perimet; " + perimetr() + ", area: " + area() + ", fill collor " + fcolor + ", border color " + bcolor);

    }
}
