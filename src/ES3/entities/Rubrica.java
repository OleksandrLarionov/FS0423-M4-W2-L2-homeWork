package ES3.entities;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

    private static Map<String, Integer> rubrica = new HashMap<>();

    public static void addContact(String name, int phoneNumber) {
        rubrica.put(name, phoneNumber);
    }

    public static void removeContact(String name) {
        if (rubrica.containsKey(name)) {
            int phoneNumber = rubrica.remove(name);
        } else {
            System.out.println("Contatto di nome :" + name + "non trovato");
        }
    }

    public static void removeContactByNameMethod2(String name) {
        rubrica.remove(name);
    }

    public static void findPhoneNumberByName(String name) {
        if (rubrica.containsKey(name)) {
            int phoneNumber = rubrica.get(name);
            System.out.println("Il numero della persona cercata di nome " + name + " è :" + phoneNumber);
        }
    }


    public static void findNameByAPhoneNumber(int phoneNumber) {
        for (Map.Entry<String, Integer> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                System.out.println("Nome : " + entry.getKey() + ", " + phoneNumber);
                return;
            }
        }
        System.out.println("Nessuna persona trovata con il numero di telefono: " + phoneNumber);
    }

    public static void findNameByAPhoneNumberMethodTwo(int phoneNumber) {
        for (String nameKey : rubrica.keySet()) {
            if (phoneNumber == (rubrica.get(nameKey))) {
                String nameFound = nameKey;
                System.out.println("Il nome trovato è: " + nameFound);
            }
        }
    }

    public static Map<String, Integer> getRubrica() {
        return rubrica;
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "rubrica=" + rubrica +
                '}';
    }
}
