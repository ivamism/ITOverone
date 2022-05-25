package Level3.Lesson6;
/*
Телефонный справочник. Создайте класс Человек, поля у него имя, фамилия, телефон, адрес, дата рождения.
В методе main создайте HashMap, ключи будут строки в виде “Фамилия Имя”, а значения будут объекты класса Человек,
добавьте несколько людей, положите их в map, выведите все значения на экран,
затем удалите 1 пару из map и снова выведите.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Human> phoneBook = new HashMap<>();
        Human petr = new Human("Petr", "Ivanov", "333-33-33", "Minsk", "22/10/1972");
        Human ivan = new Human("Ivan", "Petrov", "444-44-44", "Minsk", "22/10/1975");
        phoneBook.put(petr.surname + " " + petr.name, petr);
        phoneBook.put(ivan.surname + " " + ivan.name, ivan);
        System.out.println("Quantity of Entries: " + phoneBook.size());
        for (Map.Entry<String, Human> pair : phoneBook.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        phoneBook.remove("Ivanov Petr");
        System.out.println("Quantity of Entries: " + phoneBook.size());
        phoneBook.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}

class Human {
    String name;
    String surname;
    String phoneNumber;
    String address;
    String DOB;

    public Human(String name, String surname, String phoneNumber, String address, String DOB) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Human {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                ", address= ' " + address + '\'' +
                ", DOB = '" + DOB + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(phoneNumber, human.phoneNumber) && Objects.equals(address, human.address) && Objects.equals(DOB, human.DOB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber, address, DOB);
    }
}
