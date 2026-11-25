package Ejercicio_18_Empleado_Herencia;

public class EmpleadoAsalariado extends Empleado{
    private int salarioMensual;

    //constructor
    public EmpleadoAsalariado(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    protected int calcularSalario(){
        return this.salarioMensual;
    }
}
