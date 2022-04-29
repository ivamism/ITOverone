package Level2.Lesson3.Part1;
/*
Создать массив размером 10, заполнить его случайными числами в диапазоне от 0 до 20.
Затем в зависимости от чётности/нечётности индекса поменять значение у числа,
если индекс четный до число поменять значение на отрицательное.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numGen.nextInt(20);
            }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                numbers [i] *= (-1);
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
