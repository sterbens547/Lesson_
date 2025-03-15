//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Contacts contacts = new Contacts();
        //добавление
        contacts.record("Чижов","12344321");
        contacts.record("Пупкин","15465");
        contacts.record("Штык","1234544");
        contacts.record("Горный","123494511");
        contacts.record("Власенко","12374158");
        contacts.record("Чижик","144455");
        contacts.record("Пеньков","432156685");
        contacts.record("Шариков","123421");

        //поиск
        System.out.println("Номера по Чижов: " + contacts.get("Чижов"));


    }
}