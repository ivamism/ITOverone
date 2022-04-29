package Level2.Lesson4;
/*
Создать массив чисел размером 25,
создать метод, который принимает массив и возвращает массив из четных элементов первого массива.
 */

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[25];
        Random numGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = numGen.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(evenArrMembers(numbers)));

    }
   static int[] evenArrMembers (int[] sourceArray) {
        int newArrLength;
        if (sourceArray.length%2==0){
            newArrLength = sourceArray.length/2;
        }
        else {
            newArrLength = sourceArray.length/2+1;
        }
        int [] evenMembers = new int[newArrLength];
         int j = 0;
       for (int i=-1; i< sourceArray.length;i++) {
           boolean isEven = (i % 2) == 0;
           if (i % 2 == 0) {
               evenMembers[j] = sourceArray[i];
               j++;
           }
       }

       return evenMembers;

    }
}
