package Entidades;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa a los clientes residenciales
 * de la central telefonica.
 * Hereda de la clase Cliente
 */

@Getter
@Setter
public class ClienteResidencial extends Cliente {
    private boolean esServicioMatutino;
    private boolean esRastreoLlamada;

    public ClienteResidencial(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas, EstadoCliente estado, String horaDespertar, double pagoMensual, boolean esServicioMatutino, boolean esRastreoLlamada) {
        super(nombre, numeroCarnet, direccion, telefono, numeroLlamadas, estado, horaDespertar, pagoMensual);
        this.esServicioMatutino = esServicioMatutino;
        this.esRastreoLlamada = esRastreoLlamada;
    }

    public ClienteResidencial() {
    }
}
