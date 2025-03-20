import java.util.*;

class Contacts {

    private Map<String, List<String>> contacts;

    public Contacts() {
        phoneBook = new HashMap<>();
    }

    // добавления записи
    public void add(String name, String number) {
        // Если фамилия уже есть в справочнике, добавляем номер в список
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(number);
    }

    // поиска номеров по фамилии
    public List<String> get(String name) {
        // Возвращаем список номеров для указанной фамилии
        // Если фамилии нет, возвращаем пустой список
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
