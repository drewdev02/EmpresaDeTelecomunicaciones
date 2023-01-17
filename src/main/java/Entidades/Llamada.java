package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Llamada {
    protected float minutosDuration;
    protected String numeroOrigen;
    protected String numeroDestino;
    protected LocalDateTime fechaHora;
    protected float costoLlamada;

    public Llamada(float minutosDuration, String numeroOrigen, String numeroDestino, LocalDateTime fechaHora, float costoLlamada) {
        this.minutosDuration = minutosDuration;
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.fechaHora = fechaHora;
        this.costoLlamada = costoLlamada;
    }

    public Llamada() {
    }
}
