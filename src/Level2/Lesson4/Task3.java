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
            numbers [i] = numGen.nextInt(50);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(evenArrMembers(numbers)));

    }
   static int[] evenArrMembers (int[] sourceArray) {
        int newArrLength = 0;
       for (int number:sourceArray) {
           if (number % 2 == 0) {
               newArrLength++;
           }
       }
        int [] evenMembersArray = new int[newArrLength];
         int newArrayCounter = 0;
       for (int sourceArrayNumber : sourceArray) {

           if (sourceArrayNumber % 2 == 0) {
               evenMembersArray[newArrayCounter] = sourceArrayNumber;
               newArrayCounter++;
           }
       }
       return evenMembersArray;
    }

}
