//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Contacts boocNumber = new Contacts();

        boocNumber.add("Иванов", "123-456-789");
        boocNumber.add("Петров", "987-654-321");
        boocNumber.add("Иванов", "555-555-555");
        boocNumber.add("Сидоров", "111-222-333");

        boocNumber.printAll();

        System.out.println("\nТелефон Иванова: " + boocNumber.get("Иванов"));
        System.out.println("Телефон Петрова: " + boocNumber.get("Петров"));
        System.out.println("Телефон отсутствует: " + boocNumber.get("нет"));
    }


}