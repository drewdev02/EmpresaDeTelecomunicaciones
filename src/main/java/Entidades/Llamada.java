package Entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Clase que representa las llamadas realizadas
 * por los clientes de la central telefonica.
 * Es la clase base de la jerarquia de llamada
 */
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
