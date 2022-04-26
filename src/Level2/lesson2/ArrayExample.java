package Level2.lesson2;
/*
Массив на 10 элементов типа short с именем ages.
        - Массив на 100500 элементов типа String c именем surnames.
        - Массив на 40 элементов типа float с именем prices.
 */
public class ArrayExample {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        /*
        В методе main к каждому созданному массиву добавьте вывод в консоль размера объявленного массива.
         */
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }

}
