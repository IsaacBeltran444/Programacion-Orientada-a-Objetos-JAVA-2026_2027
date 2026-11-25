package Practica_Tema_6;

import javax.swing.*;
import java.awt.*;

public class Calculadora_Main {
    public static void main(String[] args) {
        //declaro el contenedor principal
        JFrame contenedor = new JFrame();
        contenedor.setSize(400,600);    //le doy dimensiones
        contenedor.setLayout(new BorderLayout());   //le pongo borderlayout

        JTextField resultado = new JTextField();    //declaro el frame para poner el resultado de la operación


        //declaro los botones y les pongo el textito
        JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, botPto, botSuma, botResta, botMultiplicacion, botDivision, botIgual;

        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        num0 = new JButton("0");
        botPto = new JButton(".");
        botSuma = new JButton("+");
        botResta = new JButton("-");
        botMultiplicacion = new JButton("*");
        botDivision = new JButton("/");
        botIgual = new JButton("=");

        //creo la rejilla de los numeros
        JPanel rejillaCentral = new JPanel(new GridLayout(4,3));
        rejillaCentral.add(num1);
        rejillaCentral.add(num2);
        rejillaCentral.add(num3);
        rejillaCentral.add(num4);
        rejillaCentral.add(num5);
        rejillaCentral.add(num6);
        rejillaCentral.add(num7);
        rejillaCentral.add(num8);
        rejillaCentral.add(num9);
        rejillaCentral.add(num0);
        rejillaCentral.add(botPto);


        //añadir las rejillas y demas al principal
        //pongo el frame del resultado en la zona norte del contenedor principal
        contenedor.add(resultado, BorderLayout.NORTH);

        //ver
        contenedor.setVisible(true);
        contenedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
