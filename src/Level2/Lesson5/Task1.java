package Level2.Lesson5;
/*
Написать метод, который принимает строку и индекс. Метод печатает на экран текст вида: “Символ на позиции 0 это П”,
либо “Символ на позиции 3 это В”. Пример выше для слова “Привет” и переданными индексами 0 и 3 соответственно.
 */

public class Task1 {
    public static void main(String[] args) {
        String exemple = "Привет";
//        int index = 0;
        printPosition(exemple, 0);
        printPosition(exemple, 3);
        }
        static void printPosition (String s, int position){
            System.out.println("Символ на позиции " + position + " это " + s.charAt(position));

        }

}
