package Entidades;

/**
 * Clase que representa a los clientes de estatales
 * de la central telefonica.
 * Hereda de la clase Cliente
 */

public class ClienteEstatal extends Cliente {
    private boolean esLineaArrendada;

    public ClienteEstatal(String nombre, String numeroCarnet, String direccion, String telefono, int numeroLlamadas,
                          EstadoCliente estado, String horaDespertar, double pagoMensual, boolean esLineaArrendada) {
        super(nombre, numeroCarnet, direccion, telefono, numeroLlamadas, estado, horaDespertar, pagoMensual);
        this.esLineaArrendada = esLineaArrendada;
    }

    public ClienteEstatal() {
        super();
    }


}
