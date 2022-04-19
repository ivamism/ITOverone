package Level2.lesson1HW;
/*
Площадь прямоугольника. Создать класс с методом расчёта площади
прямоугольника, в качестве аргументов приходит высота и ширина, возвращать
площадь.
 */

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника равна " + areaCalculation(5.0, 7.0) + "см2");

    }
    static double areaCalculation (double length, double width) {
        double area = (length * width)/2;
        return  area;
    }
}
