package Ejercicio_1_Formas;

public class Circle extends Shape {

    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        area = 3.14 * (radius * radius);
        return area;
    }

}