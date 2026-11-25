package Ejercicio_2_Herencia;

public class TarjetaDeVisita {
    String nombre;
    String empresa;
    String puesto;
    String direccion;
    int telefono;

    @Override
    public String
    toString() {
        return "TarjetaDeVisita{" +
                "nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", puesto='" + puesto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
