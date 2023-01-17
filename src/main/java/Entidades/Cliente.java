package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Esta clase representa a un cliente de la central telfonica
 * es la clase base de la jerarquia de clientes
 */
@Getter
@Setter

public class Cliente {

    protected String nombre;
    protected String numeroCarnet;
    protected String direccion;
    protected String telefono;
    protected int numeroLlamadas;
    protected EstadoCliente estado;
    protected String horaDespertar;
    protected ArrayList<Llamada> llamadas = new ArrayList<>();
    double pagoMensual;

    public Cliente(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas, EstadoCliente estado, String horaDespertar, double pagoMensual) {
        this.nombre = nombre;
        this.numeroCarnet = numeroCarnet;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroLlamadas = numeroLlamadas;
        this.estado = estado;
        this.horaDespertar = horaDespertar;
        this.pagoMensual = pagoMensual;
        this.llamadas = new ArrayList<>();
    }

    public Cliente() {

    }

    /**
     * Este metodo retorna el nombre del cliente
     *
     * @return nombre
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numeroLlamadas=" + numeroLlamadas +
                ", pagoMensual=" + pagoMensual +
                '}';
    }
}
