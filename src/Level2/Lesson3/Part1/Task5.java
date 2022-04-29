package Level2.Lesson3.Part1;
/*
Создать массив, размером 30 со случайными значениями чисел.
 Заменить каждый элемент массива с нечетным индексом на ноль.
 */

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numGen.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                numbers [i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
