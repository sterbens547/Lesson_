import java.util.*;

class Contacts {

    private Map<String, List<String>> phoneBook;

    public Contacts() {
        phoneBook = new HashMap<>();
    }

    // добавления записи
    public void add(String name, String number) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(number);
    }

    // поиска номеров по фамилии
    public List<String> get(String name) {
        return  phoneBook.getOrDefault(name, Collections.emptyList());
    }

    //  вывод всех записей
    public void printAll() {
        for (Map.Entry<String, List<String>> entry :  phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Телефоны: " + entry.getValue());
        }
    }
}



}
