package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteResidencial extends Cliente {
    private boolean esServicioMatutino;
    private boolean esRastreoLlamada;

    public ClienteResidencial(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas, String estado, String horaDespertar, double pagoMensual) {
        super(nombre, numeroCarnet, direccion, telefono, numeroLlamadas, estado, horaDespertar, pagoMensual);
    }

}
