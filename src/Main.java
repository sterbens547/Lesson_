//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Car","2020.12.12","Honda","Japan",2223,true);
        Product[] array = new Product[5];

        array[0] = new Product(" 525 Ultra", "01.02.2025", "625", "Южная Корея", 599, true);
        array[1] = new Product("Samsung", "15.03.2023", "Samsung", "Южная Корея", 1200, false);
        array[2] = new Product("Lenovo", "10.01.2024", "Lenovo", "Китай", 899, true);
        array[3] = new Product("iPhone", "20.05.2023", "Apple", "США", 999, false);
        array[4] = new Product("Bosch", "05.12.2022", "Bosch", "Германия", 1500, true);

        Product_1 attraction_1 = new Product_1(" Колесо обозрения ","14:00",12.12);
        Product_1 attraction_2 = new Product_1(" Качели ","14:00",12.12);


    }
}