package Level2.MyTry;

import java.util.Arrays;

public class VariationOfTask3 {
    public static void main(String[] args) {

        int[] numbers = MyArraysPatterns.createRandomArray(25, 50, -10);
        int[] numbers2 = MyArraysPatterns.createSequenceArray(20, 1);
        int[] numbers3 = MyArraysPatterns.createReverseArray(25);
        int[] numbers4 = MyArraysPatterns.createReverseArray(25, 10);
        int[] numbers5 = MyArraysPatterns.createSequenceRangeArray(5, 25);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(evenArrMembers(numbers)));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(evenArrMembers(numbers2)));
        System.out.println(Arrays.toString(numbers3));
        System.out.println(Arrays.toString(evenArrMembers(numbers3)));
        System.out.println(Arrays.toString(numbers4));
        System.out.println(Arrays.toString(evenArrMembers(numbers4)));
        System.out.println(Arrays.toString(numbers5));
        System.out.println(Arrays.toString(evenArrMembers(numbers5)));


    }

    static int[] evenArrMembers(int[] sourceArray) {
        int newArrLength = 0;
        for (int number : sourceArray) {
            if (number % 2 == 0) {
                newArrLength++;
            }
        }
        int[] evenMembersArray = new int[newArrLength];
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
