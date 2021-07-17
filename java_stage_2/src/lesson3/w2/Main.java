package lesson3.w2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+7123");
        phonebook.add("Иванов", "+7456");
        phonebook.add("Иванов", "+7987");
        phonebook.add("Петров","+8987464");
        phonebook.add("Сидоров","+5464");
        phonebook.add("Сидоров","+4984");
        phonebook.add("Васечкин","+6515198");
        phonebook.get("Иванов");
    }
}
