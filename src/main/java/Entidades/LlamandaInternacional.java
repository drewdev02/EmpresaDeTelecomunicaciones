package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class LlamandaInternacional extends Llamada{
    float tarifaPais;

    public LlamandaInternacional (float minutosDuracion, String numeroOrigen, String numeroDestino, LocalDateTime fechaHora,
                                  float costoLlamada, float tarifaPais) {
        super(minutosDuracion,numeroOrigen,numeroDestino,fechaHora,costoLlamada);

        this.tarifaPais = tarifaPais;
    }
}
