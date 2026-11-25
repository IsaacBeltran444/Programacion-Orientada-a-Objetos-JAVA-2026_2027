package Ej_1_Interfaces;

import javax.swing.*;

public class Ej_1_Interfaces_Boton {

    public static void main(String[] args) {
        //declaro el frame y boton
        JFrame frame = new JFrame();
        JButton boton = new JButton();
        //pongo el size de cada uno
        frame.setSize(550,550);
        boton.setSize(200,200);
        //pongo visible el boton
        boton.setVisible(true);
        //
        boton.setText("Aplicacion 1");
        //añado el boton al frame
        frame.add(boton);
        //pongo visible el frame con el boton
        frame.setVisible(true);
    }
}