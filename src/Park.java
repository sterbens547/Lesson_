public class Park {

    public class Attraction {

        private String name;
        private String hour;
        private double price;

    public Attraction (String name, String hour, double price){
            this.name = name;
            this.hour = hour;
            this.price = price;
        }
        public void info () {
            System.out.println("Атракцио: " + name);
            System.out.println("Время работы: " + hour);
            System.out.println("Цена: " + price);
        }

    }
    public void addAttraction (String name, String hour, double price) {
        Attraction attraction;
        attraction = new Attraction(name,hour,price);
        attraction.info();
    }
}
