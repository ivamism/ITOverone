package Level2.lesson1HW;
/*
Площадь треугольника по формуле Герона. В этой з-че нужно будет
использовать метод класса Math. В качестве аргументов стороны a, b, c. По
формуле Герона(погуглить) вначале вычислить полупериметр, затем площадь.

 */
public class HeronsFormula {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника равна " + areaCalculation(3.0, 4.0, 5.0) + "см2");
    }
    static double areaCalculation (double length, double width, double height) {
        double halfPerimeter = (length+height+width)/2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter-length)*(halfPerimeter-width)*(halfPerimeter-height));
        return area;
    }

}
