package Level2.Lesson4;
import java.util.Arrays;

    public class Task6 {
        public static void main (String [] args) {
            int [] numbers = {5,3,2,1,4};
            System.out.println (Arrays.toString (numbers));
            sort (numbers, 0, 3);
            System.out.println (Arrays.toString (numbers));
            sort (numbers, 1, 2);
            System.out.println (Arrays.toString (numbers));
            sort (numbers, 4, 3);
            System.out.println (Arrays.toString (numbers));





        }
        static int[] sort (int[] arrayToSort, int index1, int index2) {
            int intermediateValue;
            intermediateValue = arrayToSort [index1];
            arrayToSort [index1] = arrayToSort [index2];
            arrayToSort [index2] = intermediateValue;

            return arrayToSort;

        }

    }
    
