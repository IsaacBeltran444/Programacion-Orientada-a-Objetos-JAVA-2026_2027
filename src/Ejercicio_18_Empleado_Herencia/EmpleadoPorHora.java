package Ejercicio_18_Empleado_Herencia;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private int tarifaPorHora;

    //contructor
    public EmpleadoPorHora(int horasTrabajadas, int tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    protected int calcularSalario(){
        int salarioResultado;
        salarioResultado = this.horasTrabajadas * this.tarifaPorHora;
        return salarioResultado;
    }
}
