package Level2.Lesson3.Part1;
/*
Создать массив размером 15 с типом элементов String.
Записать в массив слова “чётный”, “нечётный” в зависимости от индекса, если индекс чётный, то должно быть слова “чётный”.
Вывести полученный результат на экран.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String [] array = new String [15];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = "Нечетный";
            } else {
                array[i] = "Четный";
                }
        }
        System.out.println(Arrays.toString(array));
    }
}
