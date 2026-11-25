package Ejercicio_18_Empleado_Herencia;

public class EmpleadoPorComision extends Empleado {
    private int ventasTotales;
    private int tasaComision;

    //constructor
    public EmpleadoPorComision(int ventasTotales, int tasaComision) {
        this.ventasTotales = ventasTotales;
        this.tasaComision = tasaComision;
    }

    @Override
    protected int calcularSalario(){
        int salario;
        salario = this.ventasTotales * this.tasaComision;
        return salario;
    }
}
