package Level2.MyTry;

import java.util.Arrays;
import java.util.Random;

public class VariationOfTask3 {
    public static void main(String[] args) {
//        int[] numbers = new int[25];
//        Random numGen = new Random();
//        for (int i = 0; i < numbers.length; i++) {
//            numbers [i] = numGen.nextInt(50);
//        }
        int[] numbers = MyArraysPatterns.createRandomArray(25, 50, -10);

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
