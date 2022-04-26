package Level1.Lesson4.HW.NestedLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int multiplier1;
        int multiplier2;
        for (multiplier1 = 1; multiplier1 <= 10; multiplier1++ ) {
            for (int multipier2 = 1; multipier2 <= 10; multipier2++) {
                System.out.print(multiplier1*multipier2 + "\t");

            }
            System.out.println("");
        }
    }
}
