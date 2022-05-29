package Level3.Lesson3;
/*
Создайте класс Книга, с полями название, кол-во страниц.
Поля сделайте закрытыми, добавьте геттеры и сеттеры к полям.
В сеттеры добавьте проверки для кол-ва страниц нельзя установить значения меньше 0,
для названия нельзя чтобы в название содержалось слово “name” (У строк есть метод “contains()”).
 */

public class Book {
    private String name;
    private int pageAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("name")) {
            System.out.println("Не корректное значение: " + name);
//            break;
        } else {
            this.name = name;
        }
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        if (pageAmount > 0) {
            this.pageAmount = pageAmount;
        } else {
            System.out.println("Не корректное значение: " + pageAmount);
        }
    }
}

class BookExample {
    public static void main(String[] args) {
        Book newBook = new Book();
        Book newBook2 = new Book();
        newBook.setName("Some Book");
        newBook.setPageAmount(200);
        System.out.println("Book1: " + newBook.getName() + "\nКоличество страниц: " + newBook.getPageAmount());
        newBook2.setName("name Book");
        newBook2.setPageAmount(-50);
        System.out.println("Book2: " + newBook2.getName() + "\nКоличество страниц: " + newBook2.getPageAmount());
    }
}

