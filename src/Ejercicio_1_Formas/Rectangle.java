package Ejercicio_1_Formas;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getArea() {
        area = length * width;
        return area;
    }

}