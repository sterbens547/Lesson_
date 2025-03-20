//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Contacts boocNumber = new Contacts();

        boocNumber.add("Иванов", "123-456-789");
        boocNumber.add("Петров", "987-654-321");
        boocNumber.add("Иванов", "555-555-555"); // У Иванова два номера
        boocNumber.add("Сидоров", "111-222-333");

        boocNumber.printAll();

        System.out.println("\nТелефоны Иванова: " + boocNumber.get("Иванов"));
        System.out.println("Телефоны Петрова: " + boocNumber.get("Петров"));
        System.out.println("Телефоны Неизвестного: " + boocNumber.get("Неизвестный")); // Фамилии нет в справочнике
    }


    }
}