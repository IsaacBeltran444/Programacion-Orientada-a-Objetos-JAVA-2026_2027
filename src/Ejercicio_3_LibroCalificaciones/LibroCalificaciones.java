package Ejercicio_3_LibroCalificaciones;
import java.util.Scanner;

public class LibroCalificaciones {

    private String nombreDelCurso;  //string para el nomrbe

    //====================== METODOS ======================
    //metodo para establecer el nombre del curso
    public LibroCalificaciones( String nombre ){
        nombreDelCurso = nombre;
    }

    //metodo para setear el nombre del curso
    public void establecerNombreDelCurso( String nombre ){
        nombreDelCurso = nombre;
    }

    //metodo para devolver el nombre del curso
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }

    //metodo mostrar el mensaje
    public void mostrarMensaje() {
        System.out.printf("¡Bienvenido al libro de calificaciones para\n%s!\n\n", obtenerNombreDelCurso());
    }

    //metodo calcular el promedio
    public void determinarPromedioClase(){
        Scanner entrada = new Scanner( System.in );

        int total;
        int contadorCalif;
        int calificacion;
        int promedio;
        int numCalificaciones;

        total = 0;
        contadorCalif = 1;

        System.out.println("Introduzca el número total de calificaciones:");
        numCalificaciones = entrada.nextInt();

        while ( contadorCalif <= numCalificaciones ){
            System.out.print( "Escriba la calificación: " );
            calificacion = entrada.nextInt();
            total = total + calificacion;
            contadorCalif = contadorCalif + 1;
        }

        promedio = total / 10;

        System.out.printf( "\nEl total de las 10 calificaciones es %d\n", total );
        System.out.printf( "El promedio de la clase es %d\n", promedio );

    }
}