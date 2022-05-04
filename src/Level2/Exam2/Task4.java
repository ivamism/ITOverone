package Level2.Exam2;
/*
4. Создать метод, который принимает boolean массив и проверяет, что массив однородной, т.е. в нём все эл-ты это только true,
либо только false. Метод возвращает true, если массив однородный, в противоположном случае false.
*/
public class Task4 {
    public static void main(String[] args) {
        boolean[] booleansArray = {true, false, true, true};
        System.out.println(isHomogenius(booleansArray));
    }
    private static boolean isHomogenius(boolean[] booleansArray) {
        boolean homogenius = true;
        boolean b = booleansArray[0];
        for (boolean value : booleansArray) {
            if (b != value) {
                homogenius = false;
                break;
            }
        }
        return homogenius;
    }
}
