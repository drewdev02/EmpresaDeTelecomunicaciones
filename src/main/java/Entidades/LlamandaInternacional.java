package Entidades;

import lombok.Getter;
import lombok.Setter;

/**
 * Esta clase representa las llamadas
 * de tipo internacional que puedan ser realizadas
 * por el cliente.
 * Hereda de la clase Llamada.
 */
@Getter
@Setter
public class LlamandaInternacional extends Cliente {
    private float tarifaPais;

    public LlamandaInternacional(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas,
                                 EstadoCliente estado, String horaDespertar, double pagoMensual, float tarifaPais) {
        super(nombre, numeroCarnet, direccion, telefono, numeroLlamadas, estado, horaDespertar, pagoMensual);
        this.tarifaPais = tarifaPais;
    }
}
