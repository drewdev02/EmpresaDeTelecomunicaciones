package Entidades;

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
