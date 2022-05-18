package Level3.Lesson4;
/*
создайте абстрактный класс Product, от него наследуйте 3 любых любимых вида реальных продуктов,
например: Яблоки, Томатный суп, Торт и т.д.
По желанию попробуйте придумать что-нибудь своё, если не получится берите уже готовые из задачи варианты.
В абстрактный класс добавьте общие для всех продуктов поля “цена”, “единица измерения”(может быть: “кг”, “литр”)
и поле “тип”(может быть например: “десерт”, “1ое блюдо”, “2ое блюдо”, “гарнир”, “напиток” и т.д.).
В абстр. классе должны быть 2 метода: “показать информацию” и “готовить”,
 1й метод реализован в абстрактном классе и выводит значения всех полей в консоль,
 2й метод абстрактный и реализуется в подклассах, например выводом в консоль для Яблока “помыть”,
 для Томатного супа - “разогреть в кастрюле”, для Торта - “порезать на равные кусочки чтобы досталось каждому”.
 Создайте метод main, в массив добавьте несколько продуктов и через цикл вызовите оба метода на каждом продукте.
 */

public class Task1 {
    public static void main(String[] args) {
        Product [] products = {
                new Apple(2.5, "кг" , "fruit"),
                new Soup(1.7, "литр", "1ое блюдо"),
                new Cake(10, "шт", "десерт")
        };

        for (Product currentProduct: products) {
            System.out.println(currentProduct)  ;
            currentProduct.howToUse();
        }
//        Apple apple = new Apple(1.2,"kg", "fruit");
//        System.out.println(apple.toString()) ;
//        apple.howToUse();
    }
}
abstract class Product {
    double price;
    String unitOfMesure;
    String type;

    public Product(double price, String unitOfMesure, String type) {
        this.price = price;
        this.unitOfMesure = unitOfMesure;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", unitOfMesure='" + unitOfMesure + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    //    void showInfo() {
//        System.out.println("Цена: " + price);
//        System.out.println("единица измерения: " + unitOfMesure);
//        System.out.println("тип: " + type);
//    }

    abstract void howToUse();
    }
    class Apple extends Product {

        public Apple(double price, String unitOfMesure, String type) {
            super(price, unitOfMesure, type);
        }

        @Override
        void howToUse() {
            System.out.println("помыть и порезать");
            System.out.println();
            }
    }

        class Soup extends Product {
            public Soup(double price, String unitOfMesure, String type) {
                super(price, unitOfMesure, type);
            }

            @Override
            void howToUse() {
                System.out.println("разогреть в кастрюле");
                System.out.println();
            }
        }
        class Cake extends Product {

            public Cake(double price, String unitOfMesure, String type) {
                super(price, unitOfMesure, type);
            }

            @Override
            void howToUse() {
                System.out.println("порезать на равные кусочки чтобы досталось каждому");
                System.out.println();
            }
        }


