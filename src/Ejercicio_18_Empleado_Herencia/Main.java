package Ejercicio_18_Empleado_Herencia;

public class Main {
    public static void main(String[] args) {
        Empleado [] listaEmpleados = new Empleado[3];

        listaEmpleados[0] = new EmpleadoPorHora(8,1);
        listaEmpleados[1] = new EmpleadoAsalariado(4);
        listaEmpleados[2] = new EmpleadoPorComision(7, 8);

        for(Empleado punteroFor :  listaEmpleados){
            System.out.printf("%d \n", punteroFor.calcularSalario());
        }
    }
}
