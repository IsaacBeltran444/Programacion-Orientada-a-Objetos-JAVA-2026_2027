package Ejercicio_13_Variables;

public class Main {
    public static void main(String[] args) {
        String [] meses = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Agosto",
                "Septiembre",
                "Octubre",
                "Noviembre",
                "Diciembre"
        };
        int segundo = 60;
        long memoria = 0x75AF2;
        boolean verdadero = true;

        System.out.println("Meses del año: ");
        for (String valor : meses) {
            System.out.println(valor);
        }

        System.out.println("Segundos en un minuto: " + segundo);
        System.out.println("Posicion de memoria: " + memoria);
        System.out.println("valor lógico: " + verdadero);

    }
}
