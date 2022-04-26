package Level2.lesson2;
/*
Создайте внутри метода main массив String на 4 ячейки.
            Дайте имя переменной созданного массива - names.
            Заполните массив произвольными именами.
            После этого выведите каждую ячейку на консоль.
 */
public class ArrayTask2 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "John";
        names[1] = "Poul";
        names[2] = "Jack";
        names[3] = "Andrew";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
