package Level3.Lesson5;
/*
В методе main создайте объект ArrayList с именем “список дел” с типом String. Добавьте в него ваши дела на день,
например строки: “сделать зарядку”, “поесть”, “поехать в офис”, “поработать”, “поесть”, “поработать”,
“приехать домой”, “обнять мужа/жену/детей”, “поесть”, "умыться", "лечь спать".
В списке дел должно быть как минимум 2 раза “поесть”.
Далее выведите все элементы на консоль, вначале через цикл for-each,
 затем просто передайте список в System.out.println().
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> schedule = new LinkedList<>();
        schedule.add("сделать зарядку");
        schedule.add("поесть");
        schedule.add("поехать в офис");
        schedule.add("поесть");
        schedule.add("приехать домой");
        schedule.add("обнять жену/детей");
        schedule.add("поесть");
        schedule.add("умыться");
        schedule.add("лечь спать");

        for (String currentTask : schedule) {
            System.out.println(currentTask);
        }
        System.out.println("=========");
        System.out.println(schedule);
    }
}
