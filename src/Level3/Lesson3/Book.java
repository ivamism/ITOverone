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
        } else {
            this.name = name;
        }
    }

        public int getPageAmount () {
            return pageAmount;
        }

        public void setPageAmount ( int pageAmount){
            if (pageAmount > 0) {
                this.pageAmount = pageAmount;
            }
            else {
                System.out.println("Не корректное значение: " + pageAmount);
            }
        }

    }

