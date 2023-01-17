package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Cliente {
    protected String nombre;
    protected String numeroCarnet;
    protected String direccion;
    protected String telefono;
    protected int numeroLlamadas;
    protected String estado;
    protected String horaDespertar;
    protected ArrayList<Llamada> llamadas = new ArrayList<>();
    double pagoMensual;

    public Cliente(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas, String estado, String horaDespertar, double pagoMensual) {
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
}