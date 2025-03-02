public class Product {
    private String name;
    private String date;
    private String manufacture;
    private String country;
    private double price;
    private boolean reserved;

    public void setValues(String name, String date, String manufacture, String country, double price, boolean reserved) {
        this.name = name;
        this.date = date;
        this.manufacture = manufacture;
        this.country = country;
        this.price = price;
        this.reserved = reserved;

    }
    public boolean info() {
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Country of origin: " + country);
        System.out.println("Manufacturer: " + manufacture);
        System.out.println("Price: " + price);
        System.out.println("Reserved: " +(reserved ? "Yes" : "No"));
        return false;
    }
    public Product (String name, String date, String manufacture, String country, double price, boolean reserved) {
        System.out.println("Object created");
        setValues(name,date,manufacture,country,price,reserved);
        System.out.println(info());
    }


}
