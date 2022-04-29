package Level2.Lesson4;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив чисел размером 20, написать метод,
который принимает массив и возвращает среднее арифметическое элементов массива.
 */
 public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[20];
        Random numGen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr [i] = numGen.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findAvrgSum(arr));
    }



    static double findAvrgSum(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return 1.0 * sum/arr.length;

    }
}
