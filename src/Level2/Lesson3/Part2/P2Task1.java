package Level2.Lesson3.Part2;
/*
Создать 2 массива размером 10 и 15, заполнить случайным значениями.
            Создать метод, который на вход принимает оба массива, а возвращает новый массив,
            который объединяет 1 и 2 массив. В методе main проверить работу метода.
 */

import java.util.Arrays;
import java.util.Random;

public class P2Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        Random numGen = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1 [i] = 5 + numGen.nextInt(20);
        }
        for (int i = 0; i < array2.length; i++) {
            array2 [i] = 5+ numGen.nextInt(30);
        }

        System.out.println("Array 1:" + Arrays.toString(array1));
        System.out.println("Array 2:" +Arrays.toString(array2));
        System.out.println(Arrays.toString(arrjoin(array1, array2)));

    }
    static int[] arrjoin (int[] array1, int[] array2) {
        int[] arrcomb = new int[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            arrcomb[i] = array1[i];
        }

        for (int i = array1.length ; j < array2.length; i++, j++) {
            arrcomb[i] = array2[j];
        }
        return arrcomb;
    }
}
