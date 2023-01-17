package Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Llamada {
    protected float minutosDuration;
    protected String numeroOrigen;
    protected String numeroDestino;
    protected String fecha;
    protected String hora;
    protected float costoLlamada;

    public Llamada(float minutosDuration, String numeroOrigen, String numeroDestino, String fecha, String hora, float costoLlamada) {
        this.minutosDuration = minutosDuration;
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.fecha = fecha;
        this.hora = hora;
        this.costoLlamada = costoLlamada;
    }
}
