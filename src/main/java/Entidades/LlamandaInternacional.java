package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LlamandaInternacional extends Cliente {
    private float tarifaPais;

    public LlamandaInternacional(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas, String estado, String horaDespertar, double pagoMensual, float tarifaPais) {
        super(nombre, numeroCarnet, direccion, telefono, numeroLlamadas, estado, horaDespertar, pagoMensual);
        this.tarifaPais = tarifaPais;
    }

    public LlamandaInternacional() {
        super();
    }
}
