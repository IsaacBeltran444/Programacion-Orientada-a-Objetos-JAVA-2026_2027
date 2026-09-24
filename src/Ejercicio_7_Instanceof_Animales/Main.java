package Ejercicio_7_Instanceof_Animales;

public class Main {
    public static void main(String[] args) {

        Animal[] animales = {new Perro(), new Gato(), new Pajaro()};
        /*//con for tradicional
        for (int i = 0; i < animales.length; i++) {

            //comprobar con instanceof
            if(animales[i] instanceof Perro){
                System.out.print("Es un perro y ");
            } else if (animales[i] instanceof Gato) {
                System.out.print("Es un gato y ");
            } else if (animales[i] instanceof Pajaro) {
                System.out.print("Es un pájaro y ");
            } else {
                System.out.print("Es otro animal no registrado y ");
            }

            animales[i].hacerSonido();
        }*/

        //con el otro for
        //es un puntero que apunta a un objeto del array y luego cada iteración va al siguiente y cuando termina sale
        //PARTE DERECHA -> el array donde voy a operar
        //PARTE IZQUIERDA (cursor)-> nueva variable temporal (i del for) el cual va a ir recorriendo el array
        //                           apuntando automaticamente el objeto dentro del array
        for(Animal cursor : animales){
            //comprobar con instanceof
            if(cursor instanceof Perro){
                System.out.print("Es un perro y ");
            } else if (cursor instanceof Gato) {
                System.out.print("Es un gato y ");
            } else if (cursor instanceof Pajaro) {
                System.out.print("Es un pájaro y ");
            } else {
                System.out.print("Es otro animal no registrado y ");
            }

            cursor.hacerSonido();
        }
    }
}
