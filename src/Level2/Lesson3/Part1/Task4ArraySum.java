package Level2.Lesson3.Part1;
/*
Создать массив размером 15,
написать метод, который принимает массив и возвращает сумму всех чисел этого массива.
 */

import java.util.Arrays;

public class Task4ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 1; i < arr.length; i++) {
            arr [i] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum(arr));
    }

    static int sum(int arr[]) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr [i];

        }
        return summ;
    }


}
