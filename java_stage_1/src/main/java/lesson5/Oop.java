package lesson5;

public class Oop {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Электрик", "i.i.ivanov@inbox.ru", "81234567890", 25000, 43);
        persArray[1] = new Person("Петров Петр Петрович", "Сантехник", "p.p.petrov@inbox.ru", "89765432108", 22000, 31);
        persArray[2] = new Person("Сидоров Сидр Сидорович", "Инженер", "s.s.sidorov@inbox.ru", "89998887766", 30000, 28);
        persArray[3] = new Person("Александров Александр Александрович", "Механик", "a.a.alexandrov@inbox.ru", "87766554423", 40000, 35);
        persArray[4] = new Person("Васечкин Василий Васильевич", "Дальнобойщик", "v.v.vasechkin@inbox.ru", "81237894560", 50000, 56);

        for (Person person : persArray) {
            if(person.getAge()>40){
                System.out.println(person.toString());
            }
        }
    }

    static class Person {
        private String fio;
        private String position;
        private String email;
        private String telephone;
        private int salary;
        private int age;

        public Person(String fio, String position, String email, String telephone, int salary, int age) {
            this.fio = fio;
            this.position = position;
            this.email = email;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;
        }

        @Override
        public String toString() {
            return "ФИО = " + fio + '\'' +
                    ", Должность = '" + position + '\'' +
                    ", Email = '" + email + '\'' +
                    ", Телефон = '" + telephone + '\'' +
                    ", Должность = " + salary +
                    ", Возраст = " + age;
        }

        public int getAge() {
            return age;
        }
    }
}
