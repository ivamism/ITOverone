package Level2.Exam2;
/*
5*. Написать метод, который принимает 2 строковых аргумента.
Метод должен вернуть сколько раз встречается 1 аргумент во 2 аргументе.
 */
public class Task5 {
    public static void main(String[] args) {
        String string1 = "asdfasdsdf";
        String string2 = "asd";
        System.out.println("Строка 2 встречается в строке 1 " + isContain(string1, string2) + " раз");
    }

    private static int isContain(String string1, String string2) {
        int quantity = 0;
        int indexFrom = 0;
        while (indexFrom != -1) {
            indexFrom = string1.indexOf(string2, indexFrom);
            if (indexFrom != -1) {
                quantity++;
                indexFrom += string2.length();
            }
        }
        return quantity;
    }
}
