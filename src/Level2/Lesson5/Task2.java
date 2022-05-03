package Level2.Lesson5;
/*
Написать метод, принимающий в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате "Ф.И.О".
Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */

public class Task2 {
    public static void main(String[] args) {
        String surname = "Мочалов";
        String name = "Иван";
        String fathersName = "Станиславович";
        printFIO (surname, name, fathersName);

    }

    private static void printFIO(String sn, String nm, String fn) {
//        String abbreviation;
        char s = sn.charAt(0);
        char n = nm.charAt(0);
        char f = fn.charAt(0);
//        abbreviation =  + + ;
        System.out.println(s + "." + n + "."+ f +".");

//        return abbreviation;
    }
}
