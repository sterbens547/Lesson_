public class Bowl {

    private int food;

    // Добовление миски с едой
    public Bowl(int food) {
        this.food = food;
    }
    // Уменьшение еды
    public boolean eitCat(int ate) {
        int b;
        if (this.food >= ate) {
            b = this.food - ate;
            return true;
        }
        return false;

    }
    // Добавление еды
    public void addingFood(int addFood) {
        this.food += addFood;
        System.out.println("Добавлено " + addFood + " еды. В миске " + food);
    }
}
