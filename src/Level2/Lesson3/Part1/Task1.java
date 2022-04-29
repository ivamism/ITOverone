package Level2.Lesson3.Part1;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив размером 20, заполнить случайными числами. Написать 2 метода,
которые принимают массив и
1 метод возвращает минимальное,
2 метод возвращает максимальное число этого массива.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numb = new int[20];
        Random numGen = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb [i] = numGen.nextInt(50);
            }

        System.out.println(Arrays.toString(numb));
        System.out.println();

        System.out.println("Minimum = " + minValue(numb));
        System.out.println("Maximum = " + maxValue(numb));

    }
    static int minValue(int[] arr) {
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr [i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
    static int maxValue(int[] arr) {
        int maximum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr [i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
    }

