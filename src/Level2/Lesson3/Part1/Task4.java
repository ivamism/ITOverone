package Level2.Lesson3.Part1;
/*
Создать массив размером 15,
написать метод, который принимает массив и возвращает сумму всех чисел этого массива.
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum(numbers));
    }

    static int sum(int arr[]) {
        int summ = 0;
        for (int j : arr) {
            summ += j;

        }
        return summ;
    }


}
