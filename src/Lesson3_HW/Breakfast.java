package Lesson3_HW;
/*
создать программу, в ней 2 логических переменных “есть сковородка“, “есть
яйца”. Если есть яйца и сковородка, то вывести “Готовим яичницу”. В конце
программы должен быть вывод “Идём на работу.”.
 */

public class Breakfast {
    public static void main(String[] args) {
        boolean hasPan = true;
        boolean hasEggs = false;
        if (hasPan && hasEggs) {
            System.out.println("Готовим яичницу.");
        }
        System.out.println("Идем на работу.");
    }
}
