package HW02_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class PhoneBook {
    private HashMap<String, String> phonebook = new HashMap<>();

    private ArrayList<String> getPhone(String name) {
        ArrayList<String> phones = new ArrayList<>();

        Set<Map.Entry<String, String>> phonebookMap = phonebook.entrySet();
        for (Map.Entry<String, String> entry : phonebookMap) {
            if (entry.getValue() == name)
                phones.add(entry.getKey());
        }
        return phones;
    }

    void get(String name) {
        ArrayList<String> phones = getPhone(name);
        for (String phone : phones) {
            System.out.println("Номер абонента " + name + ": " + phone);

        }
    }

    void add(String name, String phone) {
        phonebook.put(phone, name);

    }
}
