package Ejercicio_1_Formas;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Circle circulo = new Circle(10);
        Rectangle rectangulo = new Rectangle(3, 2);

        Stack<Shape> stack = new Stack<>();

        stack.push(circulo);
        stack.push(rectangulo);

        while (!stack.empty()) {

            Shape shape = stack.pop();
            System.out.println("Area = " + shape.getArea());

        }
    }
}