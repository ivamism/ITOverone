package Level2.lesson1HW;
/*
Идеальный вес. Создать класс с методом расчета идеального веса по формуле:
вес равен росту минус коэффициент. При росте до 165 см коэффициент
равен 100, до 175 см — 105, выше 175 см — 110.
 */
public class WeightCalculator {
    public static void main(String[] args) {
        System.out.println("Ваш идеальный вес - " + weightCalculations(175) + "кг.");
    }
    static int weightCalculations (int height){

        int coefficient = 0;

        if (height<165) {
            coefficient = 100;
        }
        else if (height>= 165 && height<175) {
            coefficient = 105;
        }
        else if (height>=175) {
            coefficient = 110;
        }

        return height - coefficient;
    }
}
