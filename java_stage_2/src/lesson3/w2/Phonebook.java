package lesson3.w2;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    public static final String SEPARATOR = "#";

    private List<String> phonebookList;

    public Phonebook() {
        this.phonebookList = new ArrayList<>(15);
    }

    /**
     * Method returns all telephone numbers by lastName to the console
     *
     * @param lastName lastName for search
     */
    public void get(String lastName) {
        if (phonebookList.size() == 0) {
            System.out.println("Телефонный справочник пуст");
        } else {
            for (String pos : phonebookList) {
                String[] split = pos.split(SEPARATOR);
                if (split[0].contains(lastName)) {
                    System.out.println(split[0] + " " + split[1]);
                }
            }
        }
    }

    /**
     * Method adds an entry to the phone book
     *
     * @param lastName lastName
     * @param phone    telephone number
     */
    public void add(String lastName, String phone) {
        phonebookList.add(lastName + SEPARATOR + phone);
    }
}
