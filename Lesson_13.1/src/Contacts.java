import java.util.*;

public class Contacts {


    private Map<String, List<String>> contacts;

    public Contacts() {
        contacts = new HashMap<>();
    }

    //медот добавления
    public void record(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
            contacts.get(name).add(number);
        }
    }

    //поиск
    public List<String> get(String name) {
        return
                contacts.containsKey(name) ?
                        contacts.get(name) : Collections.emptyList();
    }



}
